package handson9;

abstract public class loanemp 
{
	 protected int eId;
	    protected String eName;
	    protected double sal;
	    
	    public int getEmployeeId() 
	    {
	      return eId;
	    }
	    public void setEmployeeId(int eId) 
	    {
	      this.eId = eId;
	    }
	    public String getEmployeeName() 
	    {
	      return eName;
	    }
	    public void setEmployeeName(String eName) 
	    {
	      this.eName = eName;
	    }
	    public double getSalary() 
	    {
	      return sal;
	    }
	    public void setSalary(double salary) 
	    {
	      this.sal = sal;
	    }
	    
	    
	    public loanemp(int eId,String eName)
	    {
	        
	    this.eId=eId;
	    this.eName=eName;
	    }
	 
	  abstract public void calculateSalary();
}
