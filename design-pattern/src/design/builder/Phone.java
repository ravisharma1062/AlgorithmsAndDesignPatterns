package design.builder;

public class Phone {

	//required parameters
	private String screen;
	private String battery;

	//optional parameters
	private boolean hasFrontCamera;
	private boolean isBluetoothEnabled;

	public String getScreen() {
		return screen;
	}

	public String getBattery() {
		return battery;
	}

	public boolean isHasFrontCamera() {
		return hasFrontCamera;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public Phone(PhoneBuilder phoneBuilder) {
		this.screen = phoneBuilder.screen;
		this.battery = phoneBuilder.battery;
		this.hasFrontCamera = phoneBuilder.hasFrontCamera;
		this.isBluetoothEnabled = phoneBuilder.isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Phone [screen=" + screen + ", battery=" + battery + ", hasFrontCamera=" + hasFrontCamera
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

	//Builder Class
	public static class PhoneBuilder {

		//required parameters
		private String screen;
		private String battery;

		//optional parameters
		private boolean hasFrontCamera;
		private boolean isBluetoothEnabled;

		public PhoneBuilder(String screen, String battery){
			this.screen=screen;
			this.battery=battery;
		}

		public PhoneBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public PhoneBuilder setHasFrontCamera(boolean hasFrontCamera) {
			this.hasFrontCamera = hasFrontCamera;
			return this;
		}

		public Phone build(){
			return new Phone(this);
		}

	}

}

