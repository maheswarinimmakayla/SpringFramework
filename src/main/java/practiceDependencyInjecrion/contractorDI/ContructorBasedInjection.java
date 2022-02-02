package practiceDependencyInjecrion.contractorDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import practiceDependencyInjecrion.service.Shape;

@Component
public class ContructorBasedInjection {
	private Shape shape;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	@Autowired
	public ContructorBasedInjection(@Qualifier("square")Shape shape) {
		super();
		this.shape = shape;
	}

	public ContructorBasedInjection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
public void selectShape(String sha) {
		
		shape.selectShape(sha);
	}

}
