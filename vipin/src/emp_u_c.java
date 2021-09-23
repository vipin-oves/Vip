import java.text.DecimalFormat;
import java.util.Scanner;

class Employee
{
	private static DecimalFormat df = new DecimalFormat("0.00");

   private String ename;
   private int b_salary;
   private double da=0;
   private double hra = 0;
   private double it = 0;
   private double pf = 0;
   private double netsal=0;
   
   void getdetails(String ename, int b_salary)
   {
	   this.ename = ename;
	   this.b_salary=b_salary;
   }
   
  void allowance()
   {
	   if(b_salary<=5000)
		  {   
			  da=0.00*b_salary;
			  hra=0.00*b_salary; 
		  }
		  else if(b_salary>=5000 && b_salary<10000)
		  {
			  da=0.03*b_salary;
			  hra=0.025*b_salary;	  
		  }
		  else if(b_salary>=10000 && b_salary<20000)
		  {
			  da=0.035*b_salary;
			  hra=0.030*b_salary;
		  }
		  else if(b_salary>=20000 && b_salary<30000)
		  {
			  da=0.04*b_salary;
			  hra=0.035*b_salary;
		  }
		  else if(b_salary>=30000)
		  {
			  da=0.05*b_salary;
			  hra=0.04*b_salary;
		  }
   }
  
  void deduction()
  {
	   if(b_salary<=5000)
		  {   

			  pf=0.00*b_salary;
			  it=0.00*b_salary;
			 
		  }
		  else if(b_salary>=5000 && b_salary<10000)
		  {
			  pf=0.03*b_salary;
			  it=0.02*b_salary;
			  
		  }
		  else if(b_salary>=10000 && b_salary<20000)
		  {
		
			  pf=0.035*b_salary;
			  it=0.025*b_salary;
		
		  }
		  else if(b_salary>=20000 && b_salary<30000)
		  {
		
			  pf=0.035*b_salary;
			  it=0.03*b_salary;
	
		  }
		  else if(b_salary>=30000)
		  {
			  pf=0.05*b_salary;
			  it=0.05*b_salary;
		  }
  }
	   void printdetails()
	   {
		      System.out.println("||------------------------------");
		      System.out.println("||  Name:" + ename);
		      System.out.println("||  Basic Salary:" + b_salary);
			  System.out.println("||  Allowances:");
			  System.out.println("||  DA is: "+df.format(da));
			  System.out.println("||  HRA is: "+df.format(hra));
			  System.out.println("||  deductions:");
			  System.out.println("||  PF is: "+df.format(pf));
			  System.out.println("||  Income Tax is: "+df.format(it));
			  netsal=b_salary+(da+hra)-(pf+it);
			  System.out.println("||  Net salary is: "+df.format(netsal));
			  System.out.println("||----------------------------------");
	   }
 }



public class emp_u_c {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.getdetails("Vipin kr", 6000);
		e1.allowance();
		e1.deduction();
		e1.printdetails();
		
		Employee e2 = new Employee();
		e2.getdetails("sumit", 15000);
		e2.allowance();
		e2.deduction();
		e2.printdetails();
		
		Employee e3 = new Employee();
		e3.getdetails("Kunal", 25000);
		e3.allowance();
		e3.deduction();
		e3.printdetails();
	}

}
