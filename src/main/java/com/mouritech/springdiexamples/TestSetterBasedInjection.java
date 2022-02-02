package com.mouritech.springdiexamples;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.springdiexample.config.AppConfiguration;
import com.mouritech.springdiexample.setterdi.SetterBasedInjectionExamples;
public class TestSetterBasedInjection {
	public static void main(String[] args) {
		//Loading container with definition(configuration) given in XML file
		//ApplicationContext container = 
				//new ClassPathXmlApplicationContext("applicationContext.xml");
		@SuppressWarnings("resource")
		ApplicationContext container 
		      = new AnnotationConfigApplicationContext(AppConfiguration.class);
		SetterBasedInjectionExamples sbie = container.getBean(SetterBasedInjectionExamples.class);
		sbie.sendMsg("message sent using .........");

	}
}
