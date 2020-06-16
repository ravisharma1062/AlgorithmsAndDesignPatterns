/**
 * 
 */
package design.factory;

/**
 * @author ravisharma
 *
 */
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer desktop = ComputerFactory.getComputer("Desktop","2 GB","500 GB","2.4 GHz");
		Computer laptop = ComputerFactory.getComputer("Laptop","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory Desktop Config::" + desktop);
		System.out.println("Factory Laptop Config::" + laptop);
	}

}
