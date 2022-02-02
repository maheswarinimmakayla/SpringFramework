package practiceDependencyInjecrion.mainmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practiceDependencyInjecrion.config.ApplicationConfiguration;
import practiceDependencyInjecrion.fieldDI.FieldBasedInjection;

public class TestFieldBased {
	
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		FieldBasedInjection field = container.getBean(FieldBasedInjection.class);
		field.selectShape("i am using field based.......");
	}

}
