package com.spring.aop.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ExamApp {

	public static void main(String... args){
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Exam exam=(Exam)factory.getBean("examBean");
		exam.getQuestionNumber();
	}
}