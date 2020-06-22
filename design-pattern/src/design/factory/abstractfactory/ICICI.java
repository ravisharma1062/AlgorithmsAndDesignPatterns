package design.factory.abstractfactory;

public class ICICI implements Bank {
	
	private final String NAME;

	public ICICI() {
		NAME = "ICICI";
	}

	@Override
	public String getBankName() {
		return NAME;
	}

}
