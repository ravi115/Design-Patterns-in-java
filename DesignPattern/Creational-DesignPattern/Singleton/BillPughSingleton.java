package Singleton;

/**
 * This is special kind of single object creation based on Bill Pugh formula.
 * 
 * 1. in this strategy we have a static class inside that is responsible to get loaded and and create the object
 * at the time of client request.
 * @author raviranjan
 *
 */
public class BillPughSingleton {
	
	/**
	 * protect the constructor to get instantiate the object of this class form outside.
	 */
	private BillPughSingleton() {}
	
	/**
	 * This class will get loaded at the time of invocation
	 * @author raviranjan
	 *
	 */
	private static class BillPughSingletonHelper{
		
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	/**
	 * This method is responsible to load the BillPughSingletonHelper class into the memory and create the obejct. 
	 * 
	 * Advantages: - 
	 * 1. This approach has advantages over thread-safe singleton class as it is faster in execution.
	 * 2. Non blocking in nature for in multithreaded environment since no synchronized block used.
	 * 3. This class will create an object when the static inner class  get loaded into memory. 
	 * 
	 * 
	 * @return
	 */
	public static BillPughSingleton getInstance() {
		
		return BillPughSingletonHelper.INSTANCE;
	}
}
