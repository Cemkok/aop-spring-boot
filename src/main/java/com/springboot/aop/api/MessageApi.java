package com.springboot.aop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.aop.service.MessageService;
import com.springboot.aop.service.SecondMessageService;

@RestController
@RequestMapping("/message")
public class MessageApi {
	@Autowired
	MessageService messageService;
	@Autowired
	SecondMessageService secondMessageService;
	
	@PostMapping
	public ResponseEntity<String> aopExpMethod(@RequestBody String message){
		secondMessageService.message(message);
		return ResponseEntity.ok(messageService.getMessage(message));
		
	}
	

}
