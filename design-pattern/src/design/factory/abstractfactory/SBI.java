package design.factory.abstractfactory;

public class SBI implements Bank {
	
	private final String NAME;

	public SBI() {
		NAME = "SBI";
	}

	@Override
	public String getBankName() {
		return NAME;
	}

}
