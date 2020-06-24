package design.thread.deadlock;

public class SharedResource {
	
	synchronized void method1(SharedResource sr) {
		System.out.println("Method 1");
		sr.method2(this);
	}
	
	synchronized void method2(SharedResource sr) {
		System.out.println("Method 2");
		sr.method1(this);
	}
	
}
