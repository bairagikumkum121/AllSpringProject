package com.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Son;
import com.spring.pojo.Student;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
		Student s = context.getBean("student", Student.class);
		System.out.println(s);
		Son son1 = context.getBean("son", Son.class);
		System.out.println(son1);

	 }
}