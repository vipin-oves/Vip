package vipin;

public class Bcustomer {
	 private int  cId;
	  private String cName;
	  private String emailId;
	  
	  //Constructor
	  public Bcustomer(int cId, String cName, String emailId) {
	    super();
	    this.cId = cId;
	    this.cName = cName;
	    this.emailId = emailId;
	  }
	    //Getters and Setters
	  public int getCustomerId() {
	    return cId;
	  }
	  public void setCustomerId(int customerId) {
	    this.cId = cId;
	  }
	  public String getCustomerName() {
	    return cName;
	  }
	  public void setCustomerName(String customerName) {
	    this.cName = cName;
	  }
	  public String getEmailId() {
	    return emailId;
	  }
	  public void setEmailId(String emailId) {
	    this.emailId = emailId;
	  }
	  

}
