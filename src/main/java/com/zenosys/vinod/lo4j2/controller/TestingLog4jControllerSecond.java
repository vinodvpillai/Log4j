package com.zenosys.vinod.lo4j2.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller for testing Log4j2
 * @author VPillai
 *
 */
@RestController
public class TestingLog4jControllerSecond {

	private static Logger logger=LogManager.getLogger();
	
	@RequestMapping("/welcome-second")
	public String welcomeMessage(){
		logger.trace("Trace Message");
		logger.debug("Debug Message");
		logger.info("Info Message");
		logger.warn("Warning Message");
		logger.error("Error Message");
		logger.fatal("Fatal Message");
		
		return "Welcome to Log4j 2";
	}
}
