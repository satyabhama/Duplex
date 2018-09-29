//package com.bml.service;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.stereotype.Service;
//
//import com.bml.dao.LoginDAO;
//import com.bml.model.LoginResponse;
//import com.bml.service.rs.RestServiceImpl;
//import com.bml.user.User;
//
//@Service
//public class LoginServiceImpl2 implements LoginService {
//	private static Logger log = LoggerFactory.getLogger(RestServiceImpl.class);
//
//	@Autowired
//	LoginDAO loginDao;
//	
//	public LoginServiceImpl2() {
//		// needed for instantiation
//	}
//
////	@Override
////	// @Tracable(message = "invoking quick hello service ")
////	public LoginResponse getQuickHello(String name) {
////		log.info("LogMessages.SPRINSERVICE_HELL");
////		log.debug("LogMessages.SPRINSERVICE_HELLO_NAME, name");
////		if (name == null || name.isEmpty()) {
////			name = "world";
////		}
////		String message = "Hello " + name + "!. for snapshot test";
////		// log.debug(LogMessages.SPRINSERVICE_HELLO_MESSAGE, message);
////		LoginResponse hello = new LoginResponse();
////		// log.debug(LogMessages.SPRINSERVICE_HELLO_MESSAGE_NAME, hello.toString());
////		return hello;
////	}
//
//	 
////	@Override
////	public String login(String login) {
////
////		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
////		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
////
////		// Case1 - insert a user, put "tableA" as collection name
////		System.out.println("Case 1...");
////		User userA = new User();
////		userA.setAge(23);
//////		userA.setId(120);
//////		userA.setName("Mohini");
////
////		mongoOperation.save(userA, "User");
////
////		// find
////		Query findUserQuery = new Query();
////		findUserQuery.addCriteria(Criteria.where("name").is("Neha"));
////		User userA1 = mongoOperation.findOne(findUserQuery, User.class, "User");
////		//System.out.println(mongoOperation.findOne(findUserQuery, User.class, "User"));
////
////		return "Added " + login;
////		 
////	}
//
//	@Override
//	public LoginResponse login(String username, String password, String usertype, String usercode) { 
//		LoginResponse hh=new LoginResponse();
//		
//		try
//		{
//			//loginDao.validateLogin( username,  password);
//
////			LoginResponse hh=new LoginResponse();
//			hh.setStatus("success");
//			 
//			Query findUserQuery = new Query();
//			findUserQuery.addCriteria(Criteria.where("username").is(username));
////			User userA1 = mongoOperation.findOne(findUserQuery, User.class, "User");
//			 
//		
//			
//			
//		}catch(Exception e)
//		{
//			log.error("Error while validating username password..."+e);
//		}
//			return hh;
//	}
//
//	
//}