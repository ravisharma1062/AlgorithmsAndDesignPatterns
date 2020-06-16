/**
 * 
 */
package design.factory;

/**
 * @author ravisharma
 *
 */
public class ComputerFactory {
	
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		
		if("Desktop".equalsIgnoreCase(type)) {
			return new Desktop(ram, hdd, cpu);
		}
		else if("Laptop".equalsIgnoreCase(type)) {
			return new Laptop(ram, hdd, cpu);
		}
		
		return null;
	}
	
}
