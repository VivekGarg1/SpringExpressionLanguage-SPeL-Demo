package com.home.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.Book;
import com.home.model.BookCollection;
import com.home.model.BookLibrary;
import com.home.model.RandomNumberGenerator;


public class ClientTestUsingStaticMembers {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeansUsingStaticMembers.xml");
		RandomNumberGenerator generator = context.getBean("randomNumberGenerator", RandomNumberGenerator.class);
		System.out.println(generator.getRandomNo()+"     "+generator.getPi());
		context.close();
	}

}
