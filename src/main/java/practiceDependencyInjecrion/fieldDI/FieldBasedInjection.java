package practiceDependencyInjecrion.fieldDI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import practiceDependencyInjecrion.service.Shape;

@Component
public class FieldBasedInjection {
	@Autowired
	@Qualifier("rectangle")
	private Shape shape;
	
	

	
	public Shape getShape() {
		return shape;
	}




	public void setShape(Shape shape) {
		this.shape = shape;
	}




	public FieldBasedInjection() {
		super();
		// TODO Auto-generated constructor stub
	}




	public void selectShape(String sha) {
		
		shape.selectShape(sha);
	}

}
