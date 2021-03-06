package com.example.log4j2demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4j2DemoApplication implements ApplicationRunner {
	private static final Logger logger = LogManager.getLogger(Log4j2DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4j2DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {		
		try {
			//throw new Exception("Generating Exception To Test Log4j Mail Notification...");
			String str = null;
			if(str.equals("hello")) {
				
			}				
		} catch (Exception e) {
			logger.error("Exception Details : " + e);
			e.printStackTrace();
		}
	}
	
}
