package practiceDependencyInjecrion.service;

import org.springframework.stereotype.Service;

@Service("rectangle")
public class Rectangle  implements Shape {
	public void selectShape(String shape) {
		System.out.println("you have Rectangle shape");

	}
}
