package Arralis;



public class employe {
	private int Empno;
	private String EmpName;
	private String Job;
	private int Salary;

	/*public employe(int Empno, String EmpName, String Job,int Salary)
	{
	this.Empno=Empno;
	this.EmpName=EmpName;
	this.Job=Job;
	this.Salary=Salary;
	}*/

	public int getEmpno() {
	return Empno;
	}
	public void setEmpno(int Empno) {
		this.Empno = Empno;
	}
	public String getEmpName() {
	return EmpName;
	}
	public void setEmpName(String EmpName) {
		this.EmpName= EmpName;
	}
	public String getJob() {
	return Job;
	}
	public void setJob(String Job) {
		this.Job = Job;
	}
	public int getSalary() {
	return Salary;
	}
	public void setSalary(int salary) {
		this.Salary = salary;
	}
}

