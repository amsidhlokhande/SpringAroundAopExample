package com.amsidh.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeServiceImpl shapeService = (ShapeServiceImpl) context.getBean("shapeService");
		
		System.out.println(shapeService.getCircle());
		
		
	}

}
