/**
 * The Singleton pattern involved a single class which is 
 * responsible to create an object while making sure that 
 * only one single object gets created.
 * 
 * @author ashishpatel
 *
 */

//This class provides a static method to get its instance to outside world
public class SingleObject {
	
	//Create an object of SingleObject
	private static SingleObject instance = new SingleObject();
	
	//make the constructor private so that this class cannot be
	//instantiated
	
	private SingleObject() {}
	
	//Get the only object available
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
	}

}
