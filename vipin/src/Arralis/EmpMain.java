package Arralis;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		ArrayList<employe>  EmpList = new ArrayList<employe>();
		employe emp = null;
		Scanner sc = new Scanner(System.in);
		String ans="";
		do
		{
		System.out.println("What do you want to do? \n 1.Add\n 2.Search using emp number\n 3.Employee having same job  ");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
		{
		System.out.println("How Many Employees data you want to add");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			emp =  new employe();
			System.out.println("Employee Number : ");
			emp.setEmpno(sc.nextInt());
			System.out.println("Employee name : ");
			emp.setEmpName(sc.next());
			System.out.println("Job : ");
			emp.setJob(sc.next());
			System.out.println("Salary : ");
			emp.setSalary(sc.nextInt());
			EmpList.add(emp);
		}
		
	
		
		for(employe e : EmpList)
		{
			System.out.println("Employee Number : " + e.getEmpno());
			System.out.println("Employee Name : " + e.getEmpName());
			System.out.println("Job : " + e.getJob());
			System.out.println("Salary : " + e.getSalary());
			System.out.println("===============================");
		}
		break;
		}
		case 2:
		{
			System.out.println("Enter Employee Number : ");
			int eno = sc.nextInt();
			int flag=0;
			for(employe e : EmpList)
			{
				if(e.getEmpno()==eno)
				{
					System.out.println("Employee Number : " + e.getEmpno());
					System.out.println("Employee Name : " + e.getEmpName());
					System.out.println("Job : " + e.getJob());
					System.out.println("Salary : " + e.getSalary());
					flag++;
					break;
				}
			}
			
			if(flag==0)
				System.out.println("No Employee details Exists.");
			break;
		}
		case 3:
		{
			System.out.println("Enter Employee Job type : ");
			String j = sc.next();
			int flag=0;
			for(employe e : EmpList)
			{
				if(e.getJob().equals(j))
				{
					System.out.println("Employee Number : " + e.getEmpno());
					System.out.println("Employee Name : " + e.getEmpName());
					System.out.println("Job : " + e.getJob());
					System.out.println("Salary : " + e.getSalary());
					flag++;
				
				}
			}
			
			if(flag==0)
				System.out.println("No Employee details Exists.");
			break;
		}
		}
		System.out.println("Want to continue?(y for yes n for no)");
		 ans = sc.next();
		}while(ans.equals("y"));
	}
		

}
