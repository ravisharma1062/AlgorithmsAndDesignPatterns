package design.thread.deadlock;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {
		
		SharedResource sc1 = new SharedResource();
		
		SharedResource sc2 = new SharedResource();
		
		Thread t1 = new Thread(() -> {
			sc1.method1(sc2);
		});
		
		Thread t2 = new Thread(() -> {
			sc2.method2(sc1);
		});
		
		t1.start();
		
		t2.start();
		
		t1.join();
		
		t2.join();
	}

}
