package design.builder;

public class MainTest {

	public static void main(String[] args) {
		Phone phone = new Phone.PhoneBuilder("large", "long_lasting")
								.setBluetoothEnabled(true)
								.setHasFrontCamera(true)
								.build();
		
		System.out.println(phone.toString());
	}

}
