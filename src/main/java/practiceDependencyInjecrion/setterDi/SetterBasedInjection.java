package practiceDependencyInjecrion.setterDi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import practiceDependencyInjecrion.service.Shape;
@Component
public class SetterBasedInjection {
	private Shape shape;

	public Shape getShape() {
		return shape;
	}

	@Autowired
	@Qualifier("circle")
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public SetterBasedInjection(Shape shape) {
		super();
		this.shape = shape;
	}

	public SetterBasedInjection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void selectShape(String sha) {
		
		shape.selectShape(sha);
	}

}
