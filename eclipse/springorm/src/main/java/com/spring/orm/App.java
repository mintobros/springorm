package com.spring.orm;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {

	public static void main(String[] args) {
		// Load config file....
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/spring/orm/hibernate.cfg.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		
		Student student=new Student(102,"Nehal", "Hyderabad");
		int r=studentDao.insert(student);
		
		System.out.println(r);
		
		/*
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int userId=Integer.parseInt(br.readLine());
			Student student=studentDao.getStudent(userId);
			
			System.out.println(student.getStudentId()+" "+student.getStudentName()+" "+" "+student.getStudentCity());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		context.close();

	}

}
