package com.ailhanli.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ailhanli.AppProperties;

@Service
public class HelloServiceImpl implements HelloService {
	
	@Autowired
	private AppProperties properties;
	
	@Override
	public String getMessage() {
		return properties.getMessage();
	}
}
