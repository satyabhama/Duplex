package com.bml.service;

import com.bml.model.LoginResponse;

public interface LoginService {

	public LoginResponse login(String username, String password, String usertype, String usercode);
}
