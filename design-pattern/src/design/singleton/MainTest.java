/**
 * 
 */
package design.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ravisharma
 *
 */
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		for(int i=0; i<20; i++) {
			
			Thread t = new Thread(() -> {
				Singleton.getInstance();
			});

			executorService.submit(t);
		}
		
		executorService.shutdown();
		
	}

}
