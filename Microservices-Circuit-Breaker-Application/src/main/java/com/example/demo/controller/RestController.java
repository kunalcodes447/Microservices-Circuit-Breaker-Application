package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/service")
	@CircuitBreaker(name= "myCircuitBreaker", 
					fallbackMethod = "myFallbackMethod")
	public ResponseEntity<String> getService(){
		// Dummy exception for testing
	    throw new RuntimeException("Dummy exception for Circuit Breaker testing");
		
		//String msg = "Service called successfully";
		//return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}
	
	public ResponseEntity<String> myFallbackMethod(Exception e) {

	    String msg = "Fallback: Service is temporarily unavailable";

	    return new ResponseEntity<>(msg, HttpStatus.SERVICE_UNAVAILABLE);
	}
}
