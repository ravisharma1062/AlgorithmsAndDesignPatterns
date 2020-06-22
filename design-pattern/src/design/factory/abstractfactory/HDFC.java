package design.factory.abstractfactory;

public class HDFC implements Bank {
	
	private final String NAME;

	public HDFC() {
		NAME = "ICICI";
	}

	@Override
	public String getBankName() {
		return NAME;
	}

}
