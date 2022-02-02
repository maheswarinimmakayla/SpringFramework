package practiceDependencyInjecrion.service;

import org.springframework.stereotype.Service;

@Service("square")
public class Square  implements Shape{
	public void selectShape(String shape) {
		System.out.println("you have selected square shape");

	}
}
