package com.home.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.Book;
import com.home.model.BookCollection;
import com.home.model.BookLibrary;


public class ClientTest {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		BookLibrary bookLibrary = context.getBean("bookLibrary", BookLibrary.class);
		List<Book> bookList = bookLibrary.getAllBooks();
		for(Book book:bookList) {
			System.out.println(book.getBookId()+"\t"+book.getBookName());
		}
		System.out.println(bookLibrary.getGetFirstBook().getBookId()+"\t"+bookLibrary.getGetFirstBook().getBookName());
		 context.close();
	}

}
