package design.thread.producerconsumer;

import java.util.LinkedList;
import java.util.List;

public class PersonalComputer {
	List<Integer> list = new LinkedList<>();
	
	int capacity = 2;
	
	public void produce() throws InterruptedException {
		int value = 0;
		while(true) {
			synchronized (this) {
				while(list.size() == capacity) {
					wait();
				}
				System.out.println("Produced" + value);
				list.add(value++);
				notify();
			}
			//Thread.sleep(1000);
		}
	}
	
	public void consume() throws InterruptedException {
		while(true) {
			synchronized (this) {
				while(list.size() == 0) {
					wait();
				}
				int val = list.remove(0);
				System.out.println("Consumed" + val);
				notify();
			}
			Thread.sleep(1000);
		}
	}
}
