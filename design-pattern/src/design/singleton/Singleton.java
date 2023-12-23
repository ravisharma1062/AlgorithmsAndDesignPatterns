/**
 * 
 */
package design.singleton;

/**
 * @author ravisharma
 *
 */
public class Singleton {
	
	private static volatile Singleton instance;

	private Singleton() {
		System.out.println("Constructor Called!!!" + Thread.currentThread().getName());
	}
	
	//Returns an instance on this class
	public static Singleton getInstance() {
		if(instance == null) {
			System.out.println("Before Synchronized!!!" + Thread.currentThread().getName());
			synchronized (Singleton.class) {
				System.out.println("After Synchronized!!!" + Thread.currentThread().getName());
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		System.out.println("Returning Instance!!!" + Thread.currentThread().getName());
		return instance;
	}

}
