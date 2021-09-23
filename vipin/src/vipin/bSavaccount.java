package vipin;

public class bSavaccount extends Baccount {
	private double mBalance;
    public bSavaccount(int aNumber,Bcustomer cc1,double bal, double MBalance)
    {
     super(aNumber,cc1,bal);
     mBalance=MBalance;
    }
   
    public double getMinimumBalance() {
    return mBalance;
  }
  public void setMinimumBalance(double mBalance) {
    this.mBalance = mBalance;
  }
   public boolean withdraw(double amount)
   {
       if((bal-amount)>mBalance)
       {
           bal=(bal-amount);
           return true;
       }
       else
       return false;
   }


}
