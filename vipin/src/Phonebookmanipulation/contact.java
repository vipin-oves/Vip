package Phonebookmanipulation;

public class contact {
	  private String fName;
	  private String lName;
	  private long  pNumber;
	  private String emailId;
	  public contact(){}
	  public String getfName() {
	    return fName;
	  }
	  public void setfName(String fName) {
	    this.fName = fName;
	  }
	  public String getlName() {
	    return lName;
	  }
	  public void setlName(String lName) {
	    this.lName = lName;
	  }
	  public long getpNumber() {
	    return pNumber;
	  }
	  public void setpNumber(long pNumber) {
	    this.pNumber = pNumber;
	  }
	  public String getEmailId() {
	    return emailId;
	  }
	  public void setEmailId(String emailId) {
	    this.emailId = emailId;
	  }
	  public contact(String fName, String lName, long pNumber,String emailId) {

	    this.fName = fName;
	    this.lName = lName;
	    this.pNumber = pNumber;
	    this.emailId = emailId;
	  }
}
