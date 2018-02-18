package Singleton;

/**
 * This is singleton design pattern which gets created at the class loading regardless of their need.
 *  
 * @author raviranjan
 *
 */
public class EgerSingleton {

	private static EgerSingleton objEgerSingleton = null;

	static {
		
		try {
			objEgerSingleton = new EgerSingleton();
		}catch(Exception e) {
			throw new RuntimeException("Caught Exception while creating the object");
		}
	}

	/**
	 * make constructor private to avoid instantiation of this object. 
	 */
	private EgerSingleton() {}

	/**
	 * Provide a static method to get the object of this class.
	 * @return
	 */
	public static EgerSingleton getInsatance() {
		return objEgerSingleton;
	}
}
