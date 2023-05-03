package com.spring.orm.dao;

//import jakarta.transaction.Transactional;


import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

import jakarta.transaction.Transactional;


public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	
	//INSERT
	@Transactional
	public int insert(Student student) {
		
		Integer i = (Integer)this.hibernateTemplate.save(student);
		
		return i;
	}
	
	public Student getStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
