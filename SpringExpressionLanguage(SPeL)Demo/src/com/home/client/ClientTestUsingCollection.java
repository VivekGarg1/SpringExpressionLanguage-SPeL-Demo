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


public class ClientTestUsingCollection {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeansUsingCollections.xml");
		StudentListAccessor accessor = context.getBean("studentListAccessor", StudentListAccessor.class);
		System.out.println(accessor.getThirdStudentInList());
		
		List<StudentInfo> failedStudent = accessor.getFailedStudent();
		for(StudentInfo info:failedStudent) {
			System.out.println(info.getStuName()+"\t"+info.getMarks());
		}
		
		List<String> studentNames = accessor.getStudentNames();
		for(String name:studentNames) {
			System.out.println(name);
		}
		context.close();
	}

}
