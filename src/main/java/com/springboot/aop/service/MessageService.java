package com.springboot.aop.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	public String getMessage(String param) {
		
		System.out.println("Metod mesaj verdi param :" + param);
		return param;
				
	}

}
