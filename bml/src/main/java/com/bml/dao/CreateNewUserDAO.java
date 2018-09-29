package com.bml.dao;

import java.util.List;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.bml.common.ApplicationConstants;
import com.bml.user.NewUserVO;
import com.bml.vo.LoginDetailsVO;
import com.mongodb.MongoServerException;

@Repository
public class CreateNewUserDAO {

	private static Logger logger = LoggerFactory.getLogger(CreateNewUserDAO.class);
	@Autowired
	MongoOperations mongoOperation;

	@Autowired
	MongoTemplate mongoTemplate;

	public int validateLogin(String username, String usertype, String usercode) {

		logger.debug(ApplicationConstants.LOG_ENTRY_MESSAGE);
		int recCnt = 0;
		try {
			List<LoginDetailsVO> userInfoList = mongoTemplate.find(
					Query.query(new Criteria().andOperator(Criteria.where("swusername").is(username),
							Criteria.where("swusertype").is(usertype), Criteria.where("swusercode").is(usercode))),
					LoginDetailsVO.class);

			recCnt = userInfoList.size();

		} catch (MongoServerException ex) {
			logger.error("MongoServerException while validating username and usertype...", ex);

		} catch (Exception e) {
			logger.error("Exception while validating username and usertype...", e);

		} finally {

			logger.debug(ApplicationConstants.LOG_EXIT_MESSAGE);
		}
		return recCnt;

	}

	public int createUserAccount(NewUserVO user) {

		logger.debug(ApplicationConstants.LOG_ENTRY_MESSAGE);
		int recCnt = 0;
		try {
			ObjectId id = ObjectId.get();
			user.setId(id);
			mongoOperation.insert(user, "sw_user");
			recCnt = 1;

		} catch (MongoServerException e) {
			recCnt = 0;
			logger.error("Exception while creating new user...", e);

		} catch (Exception e) {
			recCnt = 0;
			logger.error("Exception while creating new user...", e);

		} finally {

			logger.debug(ApplicationConstants.LOG_EXIT_MESSAGE);
		}
		return recCnt;

	}
}
