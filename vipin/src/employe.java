import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class employe {
	private static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);   
		System.out.print("Employee name:");
		String name=sc.next();   
		System.out.print("Basic salary:");
		int b_salary=sc.nextInt();
		  double da=0;
		  double hra = 0;
		  double it = 0;
		  double pf = 0;
		  double netsal=0;
		  if(b_salary<=5000)
		  {   
			  da=0.00*b_salary;
			  hra=0.00*b_salary;
			  pf=0.00*b_salary;
			  it=0.00*b_salary;
			 
		  }
		  else if(b_salary>=5000 && b_salary<10000)
		  {
			  da=0.03*b_salary;
			  hra=0.025*b_salary;
			  pf=0.03*b_salary;
			  it=0.02*b_salary;
			  
		  }
		  else if(b_salary>=10000 && b_salary<20000)
		  {
			  da=0.035*b_salary;
			  hra=0.030*b_salary;
			  pf=0.035*b_salary;
			  it=0.025*b_salary;
		
		  }
		  else if(b_salary>=20000 && b_salary<30000)
		  {
			  da=0.04*b_salary;
			  hra=0.035*b_salary;
			  pf=0.035*b_salary;
			  it=0.03*b_salary;
	
		  }
		  else if(b_salary>=30000)
		  {
			  da=0.05*b_salary;
			  hra=0.04*b_salary;
			  pf=0.05*b_salary;
			  it=0.05*b_salary;

		  }
		  
		  System.out.println("||=============================");
		  System.out.println("||  Allowances:");
		  System.out.println("||  DA is: "+df.format(da));
		  System.out.println("||  HRA is: "+df.format(hra));
		  System.out.println("||=============================");
		  System.out.println("||  deductions:");
		  System.out.println("||  PF is: "+df.format(pf));
		  System.out.println("||  Income Tax is: "+df.format(it));
		  netsal=b_salary+(da+hra)-(pf+it);
		  System.out.println("||=============================");
		  System.out.println("||  Net salary is: "+df.format(netsal));
		  System.out.println("||=============================");
	}

}
