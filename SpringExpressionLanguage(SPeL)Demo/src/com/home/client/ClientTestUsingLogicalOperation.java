package com.home.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.Book;
import com.home.model.BookCollection;
import com.home.model.BookLibrary;
import com.home.model.ExaminationResult;
import com.home.model.PerimeterCalculator;
import com.home.model.RandomNumberGenerator;


public class ClientTestUsingLogicalOperation {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeansUsingLogicalOperation.xml");
		ExaminationResult result = context.getBean("examinationResult", ExaminationResult.class);
		System.out.println(result.isHasPassed()+"\t"+result.getResultMessage());
		context.close();
	}

}
