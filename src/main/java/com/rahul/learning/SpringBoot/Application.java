/**
 * 
 */
package com.rahul.learning.SpringBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author delhivery
 *
 */
@SpringBootApplication
public class Application {
	
	@Value("${server.log.file}")
	private static String loggerPath;
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		System.out.println("Spring boot is up and running...");
		System.out.println("**********" + loggerPath + "************");
	}
	
	public void run(String... strings) throws Exception {
		System.out.println("Hello");
	}
}
