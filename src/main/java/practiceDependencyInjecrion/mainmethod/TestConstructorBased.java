package practiceDependencyInjecrion.mainmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import practiceDependencyInjecrion.config.ApplicationConfiguration;
import practiceDependencyInjecrion.contractorDI.ContructorBasedInjection;

public class TestConstructorBased {
	
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
	ContructorBasedInjection con = container.getBean(ContructorBasedInjection.class);
	con.selectShape("i am using contructor");
	}

}
