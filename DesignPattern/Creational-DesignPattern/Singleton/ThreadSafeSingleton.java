package Singleton;

/**
 * This class implements the thread safe approach to create the object of this class using double check method.
 * @author raviranjan
 *
 */
public class ThreadSafeSingleton {

	private static ThreadSafeSingleton objThreadSafeSingleton = null;

	private ThreadSafeSingleton() {}

	/**
	 * 
	 * @return
	 */
	public static ThreadSafeSingleton getInstance() {

		if(objThreadSafeSingleton ==null) {
			synchronized(ThreadSafeSingleton.class) {
				if(objThreadSafeSingleton ==null) {
					objThreadSafeSingleton = new ThreadSafeSingleton();
				}
			}
		}
		return objThreadSafeSingleton;
	}

}
