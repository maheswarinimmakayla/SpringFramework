package practiceDependencyInjecrion.service;

import org.springframework.stereotype.Service;

@Service("circle")
public class Circle implements Shape  {

public void selectShape(String shape) {
System.out.println("you have selected circle");
	}
}
