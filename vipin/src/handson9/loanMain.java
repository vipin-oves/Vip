package handson9;

import java.util.Scanner;


public class loanMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=sc.nextLine();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        int e=sc.nextInt();
        int f=sc.nextInt();
        loanemp e1=new pemp(a,b,d);
        e1.calculateSalary();
        loanemp e2=new temp(a,b,e,f);
        e2.calculateSalary();
        loan l=new loan();
        l.calculateLoanAmount(e1);
        l.calculateLoanAmount(e2);
	}

}
