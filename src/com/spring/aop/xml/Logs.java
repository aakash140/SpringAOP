package com.spring.aop.xml;

public class Logs {

	public void beforeAdvice(){
		System.out.println("Exam is going to start...");
	}
	public void afterAdvice(){
	      System.out.println("Exam has ended.");
	   }
}