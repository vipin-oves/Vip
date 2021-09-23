package handson9;

public class pemp extends loanemp
{
	 private double basicPay;
	    
	    public double getBasicPay() {
	    return basicPay;
	  }
	  public void setBasicPay(double basicPay) {
	    this.basicPay = basicPay;
	  }
	     
	    public pemp(int eId,String eName,double basicpay)
	    {
	        super(eId,eName);
	        this.basicPay=basicpay;
	    }
	      
	    public void calculateSalary()
	    {
	        double PFamount=0;
	        PFamount=(basicPay*0.12);
	        setSalary(basicPay-PFamount);
	    }
}
