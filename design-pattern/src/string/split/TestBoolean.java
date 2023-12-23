package string.split;

import java.util.concurrent.atomic.AtomicBoolean;

public class TestBoolean {
	
	public static void main(String[] args) {
		AtomicBoolean flag = new AtomicBoolean(false);
		for(int i=0; i<5; i++) {
			testMethod(flag);
		}
	}

	private static void testMethod(AtomicBoolean flag) {
		System.out.println(flag.get());
		if(flag.get() == false)
			flag.set(!flag.get());
	}

}
