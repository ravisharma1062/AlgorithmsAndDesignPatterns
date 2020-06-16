/**
 * 
 */
package design.singleton;

/**
 * @author ravisharma
 *
 */
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(() -> {
			for(int i=0; i<10; i++) {
				Singleton.getInstance();
			}
		}).start();
	}

}
