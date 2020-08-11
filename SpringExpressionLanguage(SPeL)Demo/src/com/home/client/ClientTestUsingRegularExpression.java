package com.home.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.Book;
import com.home.model.BookCollection;
import com.home.model.BookLibrary;
import com.home.model.EmailValidator;
import com.home.model.ExaminationResult;
import com.home.model.PerimeterCalculator;
import com.home.model.RandomNumberGenerator;


public class ClientTestUsingRegularExpression {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeansUsingRegularExpression.xml");
		EmailValidator validator = context.getBean("emailValidator", EmailValidator.class);
		System.out.println(validator.isValidEmail());
		context.close();
	}

}
