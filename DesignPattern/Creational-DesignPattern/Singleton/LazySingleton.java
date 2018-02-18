package Singleton;

/**
 * This singleton design pattern implements the Lazy object creation of class. 
 * but should not hold good for multithreaded.
 * @author raviranjan
 *
 */
public class LazySingleton {

	private static LazySingleton objLazySingleton = null;

	/**
	 * protect constructor to direct instantion of this class outside of this class.
	 */
	private LazySingleton() {}

	/**
	 * This design pattern creates the object when it is actually being asked.
	 * Drawback of this class: - 
	 * in multi-threaded environment if multiple threads are inside `if` loop checking the instance == null, then
	 * there may be a chances of inconsistency of object creation. and there could be more than one objects gets 
	 * created. 
	 * 
	 * @return
	 */
	public static LazySingleton getInstance() {

		LazySingleton LazySingleton = null;
		if(objLazySingleton == null)
			objLazySingleton = new LazySingleton();
		
		return LazySingleton;
	}

}
