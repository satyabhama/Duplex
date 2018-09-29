package com.bml.service.rs;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bml.model.LoginResponse;
import com.bml.model.NewUserResponse;

@CrossOrigin(maxAge = 3600)
@RestController
public interface RestService {

//	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/login")
	@ResponseBody
	public LoginResponse login(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password,
			@RequestParam(name = "username") String usertype,
			@RequestParam(name = "password") String usercode);

	@PostMapping("/signup")
	@ResponseBody
	public NewUserResponse createUserAccount(@RequestParam(name = "firstname", required = true) String firstname,
			@RequestParam(name = "lastname", required = true) String lastname,
			@RequestParam(name = "dob", required = true) String dob,
			@RequestParam(name = "gender", required = false) String gender,
			@RequestParam(name = "address", required = true) String address,
			@RequestParam(name = "city", required = false) String city,
			@RequestParam(name = "state", required = false) String state,
			@RequestParam(name = "zip", required = false) String zip,
			@RequestParam(name = "email", required = true) String email,
			@RequestParam(name = "username", required = true) String userid,
			@RequestParam(name = "password", required = true) String password,
			@RequestParam(name = "usertype", required = true) String usertype,
			@RequestParam(name = "usercode", required = true) String usercode,
			@RequestParam(name = "phone", required = true) Long phone,
			@RequestParam(name = "age", required = false) Integer age) throws Exception;

}
