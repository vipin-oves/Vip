package vipin;

abstract public class Baccount {
	protected int aNumber;
	protected Bcustomer cc1;
	protected double bal;
	public Baccount(int aNumber,Bcustomer cc1,double bal)
	{
	    this.aNumber=aNumber;
	    this.cc1=cc1;
	    this.bal=bal;
	}
	    
	    
	    public int getAccountNumber() {
	    return aNumber;
	  }
	  public void setAccountNumber(int accountNumber) {
	    this.aNumber = aNumber;
	  }
	  public Bcustomer getCustomerObj() {
	    return cc1;
	  }
	  public void setCustomerObj(Bcustomer customerObj) {
	    this.cc1 = cc1;
	  }
	  public double getBalance() {
	    return bal;
	  }
	  public void setBalance(double balance) {
	    this.bal = bal;
	  }
	    abstract public boolean withdraw(double a);

}
