package com.inst.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inst.aop.HelloWorld;

public class TestAop1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		HelloWorld hw1 = (HelloWorld) context.getBean("helloworld11");
		HelloWorld hw2 = (HelloWorld) context.getBean("helloworld12");
		hw1.printHelloWorld();
		System.out.println();
		hw1.doPrint();
		
		System.out.println();
		hw2.printHelloWorld();
		System.out.println();
		hw2.doPrint();
	}
}
