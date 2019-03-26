/**
 * Create Factory classes extending AbstractFactory to generate
 * object of concrete class based on given information
 * @author ashishpatel
 *
 */
public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
	

}
