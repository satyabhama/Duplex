package com.bml.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.bml.common.ApplicationConstants;
import com.bml.vo.LoginDetailsVO;

@Repository
public class LoginDAO {

	private static Logger logger = LoggerFactory.getLogger(LoginDAO.class);
	@Autowired
	MongoOperations mongoOperation;

    @Autowired
    MongoTemplate mongoTemplate;

	public int validateLogin(String username, String password, String usertype, String usercode) {

		logger.debug(ApplicationConstants.LOG_ENTRY_MESSAGE);
		int recCnt=0;
		try {
			 
//			Query findUserQuery = new Query();
//			findUserQuery.addCriteria(new Criteria().andOperator(Criteria.where("swusername").is(username),
//                    Criteria.where("swpassword").is(password),
//                    Criteria.where("swusertype").is(usertype),
//                    Criteria.where("swusercode").is(usercode)));
//			LoginDetailsVO userA1 = mongoOperation.findOne(findUserQuery, LoginDetailsVO.class, "sw_user");
//			 
//			System.out.println(userA1);
			
			List<LoginDetailsVO> conDetails = mongoTemplate.find(Query.query(new Criteria()
                    .andOperator(Criteria.where("conID").is(username),
                                Criteria.where("conID").is(username))
                                /*Criteria.where("pickupDate").is(usertype),
                               Criteria.where("swusercode").is(usercode))*/
                    ), LoginDetailsVO.class);
			
			recCnt=conDetails.size();

		} catch (Exception e) {
			logger.error("Exception while validating login details...",e);

		} finally {

			logger.debug(ApplicationConstants.LOG_EXIT_MESSAGE);
		}
		return recCnt;

	}
}
