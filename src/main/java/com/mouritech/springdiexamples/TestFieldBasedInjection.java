package com.mouritech.springdiexamples;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.springdiexample.config.AppConfiguration;
import com.mouritech.springdiexample.fieldbaseddi.FiledBaseInjection;
public class TestFieldBasedInjection {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext container 
		      = new AnnotationConfigApplicationContext(AppConfiguration.class);
		FiledBaseInjection fbie = container.getBean(FiledBaseInjection.class);
		fbie.sendMsg("message sent using .........");
	}
}
