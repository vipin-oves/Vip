package Assessment1;



public class SAccount extends Account implements MaintenanceChargeCalcultions{

	public SAccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
	}
	@Override
		public float calculatemaintenancecharge(float no_Of_Years) {
			int m = 50;
			float maintenanceCharge = (m * no_Of_Years)+50;
			return maintenanceCharge;
	}

}
