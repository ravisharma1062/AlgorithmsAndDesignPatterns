package design.thread.producerconsumer;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {
		final PersonalComputer personalComputer = new PersonalComputer();
		
		Thread t1 = new Thread(() -> {
			try {
				personalComputer.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Thread t2 = new Thread(() -> {
			try {
				personalComputer.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		t1.start();
		
		t2.start();
		
		t1.join();
		
		t2.join();

	}

}
