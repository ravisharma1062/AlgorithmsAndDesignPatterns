/**
 * 
 */
package design.thread.callable;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author ravisharma
 *
 */
public class CallableExample implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		
        Random generator = new Random(); 
  
        Integer randomNumber = generator.nextInt(5); 
  
        Thread.sleep(2000); 
  
        return randomNumber;
        
	}

}
