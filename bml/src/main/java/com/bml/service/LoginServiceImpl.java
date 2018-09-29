package com.bml.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bml.common.ApplicationConstants;
import com.bml.dao.LoginDAO;
import com.bml.model.LoginResponse;
import com.bml.service.rs.RestServiceImpl;

@Service
public class LoginServiceImpl implements LoginService {
	private static Logger log = LoggerFactory.getLogger(RestServiceImpl.class);

	@Autowired
	LoginDAO loginDao;

	public LoginServiceImpl() {
		// needed for instantiation
	}

	@Override
	public LoginResponse login(String username, String password, String usertype, String usercode) {
		LoginResponse loginRes = new LoginResponse();

		log.debug(ApplicationConstants.LOG_ENTRY_MESSAGE);
		try {

			int count = loginDao.validateLogin(username, password, usertype, usercode);
			if(count>0)
			{
				loginRes.setStatus("Correct");
			}else
			{
				loginRes.setStatus("Incorrect");
			}
		} catch (Exception e) {
			log.error("Error while validating username password..." + e);
		} finally {

			log.debug(ApplicationConstants.LOG_EXIT_MESSAGE);
		}
		return loginRes;
	}

}