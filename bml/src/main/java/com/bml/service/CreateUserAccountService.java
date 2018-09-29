package com.bml.service;

import com.bml.model.NewUserResponse;

public interface CreateUserAccountService {

	NewUserResponse createUserAccount(String firstname, String lastname, String dob, String gender, String address, String city,
			String state, String zip, String email, String userid, String password, String usertype, String usercode, Long phone,
			Integer age)throws Exception;

}
