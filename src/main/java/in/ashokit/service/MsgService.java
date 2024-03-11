package in.ashokit.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MsgService {

	private Logger logger = LoggerFactory.getLogger(MsgService.class);

	public String getWelcomeMsg() {

		logger.trace("this is trace msg...");
		logger.debug("this is debug msg...");

		logger.info("getWelcomeMsg() - (info) started...");

		String msg = "Welcome to Ashok IT";

		logger.info("getWelcomeMsg() -  (info) ended....");

		logger.warn("this is warning msg...");
		logger.error("this is error msg");

		return msg;
	}
}


