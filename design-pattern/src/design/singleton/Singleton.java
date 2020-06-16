/**
 * 
 */
package design.singleton;

/**
 * @author ravisharma
 *
 */
public class Singleton {
	
	private static Singleton instance;

	private Singleton() {
		System.out.println("Constructor Called!!!");
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			System.out.println("Before Synchronized!!!");
			synchronized (Singleton.class) {
				System.out.println("After Synchronized!!!");
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		System.out.println("Returning Instance!!!");
		return instance;
	}

}
