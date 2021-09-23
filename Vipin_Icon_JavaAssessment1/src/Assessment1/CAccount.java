package Assessment1;

public class CAccount extends Account implements MaintenanceChargeCalcultions {

	public CAccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
	}

	@Override
	public float calculatemaintenancecharge(float no_Of_Years) {
		int m = 100;
		float maintanenaceCharge = (m * no_Of_Years)+200;
		return maintanenaceCharge;
}
}
