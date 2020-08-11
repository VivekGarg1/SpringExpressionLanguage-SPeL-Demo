package com.home.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.Book;
import com.home.model.BookCollection;
import com.home.model.BookLibrary;
import com.home.model.PerimeterCalculator;
import com.home.model.RandomNumberGenerator;


public class ClientTestUsingMathmeticalOperation {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeansUsingMathemeticalOperation.xml");
		PerimeterCalculator calculator = context.getBean("perimeterCalculator", PerimeterCalculator.class);
		System.out.println(calculator.getPerimeter());
		context.close();
	}

}
