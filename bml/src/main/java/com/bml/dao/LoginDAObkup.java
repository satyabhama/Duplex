//package com.bml.dao;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.dao.DataAccessException;
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.stereotype.Repository;
//
//import com.bml.common.ApplicationConstants;
//import com.bml.config.SpringMongoConfig;
//import com.bml.user.User;
//
//@Repository
//public class LoginDAObkup {
//
//	private static Logger logger = LoggerFactory.getLogger(LoginDAObkup.class);
//	@Autowired
//	MongoOperations mongoOperation ;
////	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
////	MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
//
//	public Integer addUser(String name, Integer age) throws Exception {
//		logger.info(ApplicationConstants.LOG_ENTRY_MESSAGE);
//
//		Integer accessCount = null;
//		try {
//			User userA = new User();
//			userA.setAge(23);
//			// userA.setId(211);
//			// userA.setName(name);
//
//			mongoOperation.save(userA, "User");
//
//		} catch (DataAccessException e) {
//			logger.error("DataAccessException:", e);
//			throw e;
//		} catch (Exception e) {
//			logger.error("Exception:", e);
//			throw e;
//		} finally {
//			logger.error("");
//		}
//
//		return accessCount;
//
//	}
//
//	public void createUserAccount(User user) {
//		logger.info(ApplicationConstants.LOG_ENTRY_MESSAGE);
//
//		try {
//
//			mongoOperation.save(user, "User");
//
//		} catch (DataAccessException e) {
//			logger.error("DataAccessException:", e);
//			throw e;
//		} catch (Exception e) {
//			logger.error("Exception:", e);
//			throw e;
//		} finally {
//			logger.info(ApplicationConstants.LOG_EXIT_MESSAGE);
//		}
//
//	}
//
//	public void validateLogin(String username, String password) {
//		// TODO Auto-generated method stub
//		
//	}
//}
