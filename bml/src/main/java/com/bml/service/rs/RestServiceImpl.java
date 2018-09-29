package com.bml.service.rs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bml.common.ApplicationConstants;
import com.bml.model.LoginResponse;
import com.bml.model.NewUserResponse;
import com.bml.service.CreateUserAccountService;
import com.bml.service.LoginService;

@Service
public class RestServiceImpl implements RestService {
	private static Logger log = LoggerFactory.getLogger(RestServiceImpl.class);

	@Autowired
	private LoginService service;

	@Autowired
	private CreateUserAccountService createUserAccountService;

	public RestServiceImpl() {
		// needed for autowiring
	}
	@Override
	public LoginResponse login(String username, String password, String usertype, String usercode) {
		 log.debug(ApplicationConstants.LOG_ENTRY_MESSAGE);
		return service.login(username,password,usertype,usercode);
	}
	@Override
	public NewUserResponse createUserAccount(String firstname, String lastname, String dob, String gender, String address,
			String city, String state, String zip, String email, String userid, String password, String usertype,
			String usercode, Long phone, Integer age) throws Exception {
		 log.debug(ApplicationConstants.LOG_ENTRY_MESSAGE);
		return createUserAccountService.createUserAccount(firstname, lastname, dob, gender, address, city, state, zip, email, userid, password,usertype,usercode, phone, age);
	}

}
