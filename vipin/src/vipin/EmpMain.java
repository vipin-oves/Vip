package vipin;

import java.util.Scanner;

public class EmpMain {
	public static void main(String arg[]){
	    EMp e=getEDetails();
	    int temp=getPFPercent();
	    e.calculateNetSalary(temp);
	    System.out.println("Id: "+e.getEmployeeId());
	    System.out.println("Name: "+e.getEmployeeName());
	    System.out.println("Salary: "+e.getSalary());
	    System.out.println("Net Salary: "+e.getNetSalary());

	}
	public static EMp getEDetails(){
	Scanner s=new Scanner(System.in);
    EMp e=new EMp();
    System.out.println("Enter Id:");
    e.setEmployeeId(s.nextInt());
    System.out.println("Enter Name:");
    e.setEmployeeName(s.next());
    System.out.println("Enter salary:");
    e.setSalary(s.nextDouble());
    return e;
}
public static int getPFPercent(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter PF percentage:");
    int val=s.nextInt();
    return val;
}

}
