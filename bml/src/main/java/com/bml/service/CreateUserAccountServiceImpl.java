package com.bml.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bml.common.ApplicationConstants;
import com.bml.dao.CreateNewUserDAO;
import com.bml.model.NewUserResponse;
import com.bml.service.rs.RestServiceImpl;
import com.bml.user.NewUserVO;

@Service
public class CreateUserAccountServiceImpl implements CreateUserAccountService {
	private static Logger log = LoggerFactory.getLogger(RestServiceImpl.class);

	@Autowired
	CreateNewUserDAO userDao;

	public CreateUserAccountServiceImpl() {
		// needed for instantiation
	}

	@Override
	public NewUserResponse createUserAccount(String firstname, String lastname, String dob, String gender,
			String address, String city, String state, String zip, String email, String username, String password,
			String usertype, String usercode, Long phone, Integer age) throws Exception {

		log.info(ApplicationConstants.LOG_ENTRY_MESSAGE);
		NewUserResponse response = new NewUserResponse();
		int cnt=0;
		try {

			log.debug("validate username and user type...");

			cnt = userDao.validateLogin(username, usertype, usercode);

			if (cnt > 0) {
				response.setMessage("Username not available...");
			} else {
				NewUserVO userdetails = new NewUserVO(); 
				userdetails.setFirstname(firstname);
				userdetails.setLastname(lastname);
				userdetails.setDob(dob);
				userdetails.setGender(gender);
				userdetails.setAddress(address);
				userdetails.setCity(city);
				userdetails.setState(state);
				userdetails.setZip(zip);
				userdetails.setEmail(email);
				userdetails.setUserid(username);
				userdetails.setPassword(password);
				userdetails.setUsertype(usertype);
				userdetails.setUsercode(usercode);
				userdetails.setPhone(phone);
				userdetails.setAge(age);
				userdetails.setCreatedDate(new Date());

				cnt=userDao.createUserAccount(userdetails);
				if(cnt>0)
				{
					response.setMessage("User added successfully...");
				}else
				{
					response.setMessage("Error while  creating user...");
				}
			}

		} catch (Exception e) {
			throw e;
		} finally {

			log.info(ApplicationConstants.LOG_EXIT_MESSAGE);
		}
		return response;
	}

}