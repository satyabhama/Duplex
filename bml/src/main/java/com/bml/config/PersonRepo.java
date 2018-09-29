package com.bml.config;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bml.vo.LoginDetailsVO;

public interface PersonRepo extends MongoRepository<LoginDetailsVO, String>{

}
