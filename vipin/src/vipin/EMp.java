package vipin;

public class EMp {
	private int eId;
	private String eName;
	private double sal;
	private double netSal;
	public int getEmployeeId() {
	    return eId;
	}
	public String getEmployeeName()  {
	    return eName;
	}
	public double getSalary() {
	    return sal;
	}
	public void setEmployeeId(int eId) {
	    this.eId=eId;
	}
	public void setEmployeeName(String eName)  {
	    this.eName=eName;
	}
	public void setSalary(double sal) {
	    this.sal=sal;
	}
	public void calculateNetSalary(int pf) {
	    double temp=(pf/100.00);
	    setNetSalary(sal-(sal*(temp)));
	}
	public void setNetSalary(double netSal) {
	    this.netSal=netSal;
	}
	public double getNetSalary() {
	    return netSal;

}
}
