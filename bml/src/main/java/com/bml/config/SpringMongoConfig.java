//package com.bml.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//import com.mongodb.MongoClient;
//import com.mongodb.MongoClientURI;
//
///**
// * Spring MongoDB configuration file
// * 
// */
//@Configuration
//public class SpringMongoConfig{
//
//	public @Bean
//	MongoTemplate mongoTemplate() throws Exception {
//		
////		MongoTemplate mongoTemplate = 
////				new MongoTemplate(new MongoClient("127.0.0.1"),"Dev");
////			return mongoTemplate;
////			
//        MongoClientURI uri  = new MongoClientURI("mongodb://MohiniGawale:mohini123@ds115193.mlab.com:15193/googleduplex"); 
//        MongoClient client = new MongoClient(uri);
//
//		MongoTemplate mongoTemplate = 
//			new MongoTemplate(client,"googleduplex");
//		return mongoTemplate;
//		
//	}
//		
//}
