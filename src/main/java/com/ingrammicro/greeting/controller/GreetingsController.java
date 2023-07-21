package com.ingrammicro.greeting.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
public class GreetingsController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GET
	@RequestMapping("/greetings")
	@Produces("application/json")
	public Response getMessage(){
		String msg="Good Start!! GoAhed!! All is Well!!";
		System.out.println("Good Start!! GoAhed!! All is Well!!");
		logger.info("Time :"+java.time.LocalDateTime.now()+" log message :: "+msg);
		logger.error("error log!!");
		logger.warn("warn log!!");
		String wishMessage = getWishMessage();
		logger.info("Message From ServiceImpl Class Method ::"+wishMessage);		
		return Response.ok(msg).build();
				
	}
	
	public String getWishMessage() {
		System.out.println("Time :"+java.time.LocalDateTime.now()+" From getWishMessage Impl");
		logger.info("Time :"+java.time.LocalDateTime.now()+" From Service Impl");
		return "Hello How are you?";
	}
}
