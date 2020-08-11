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
import com.home.model.StudentInfo;
import com.home.model.StudentListAccessor;
import com.home.model.TelephoneDirectoryAccessor;


public class ClientTestUsingCollectionMap {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeansUsingCollectionsMap.xml");
		TelephoneDirectoryAccessor accessor = context.getBean("telephoneDirectoryAccessor", TelephoneDirectoryAccessor.class);
		System.out.println("Paras Contact no: "+accessor.getTelePhoneNo());
		context.close();
	}

}
