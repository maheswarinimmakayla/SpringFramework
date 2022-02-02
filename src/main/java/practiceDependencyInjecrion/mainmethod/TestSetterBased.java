package practiceDependencyInjecrion.mainmethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practiceDependencyInjecrion.config.ApplicationConfiguration;
import practiceDependencyInjecrion.setterDi.SetterBasedInjection;

public class TestSetterBased {
	
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		SetterBasedInjection set = container.getBean(SetterBasedInjection.class);
		
		set.selectShape("i am selected using setter.............");
	}

}
