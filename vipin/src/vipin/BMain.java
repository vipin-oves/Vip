package vipin;

import java.util.Scanner;

public class BMain {

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter account number:");
        int a=s.nextInt();
        System.out.println("Enter customer ID:");
        int a2=s.nextInt();
        System.out.println("Enter customer Name:");
        String b2=s.nextLine();
        s.nextLine();
        System.out.println("Enter customer EmailID:");
        String c2=s.nextLine();
        Bcustomer c=new Bcustomer(a2,b2,c2);
        System.out.println("balance");
        double b=s.nextDouble();
        System.out.println("min");
        double d=s.nextDouble();
        if(d>b)
        {
        	System.out.println("Invalid min balance");
        	System.out.println("Enter min balance again");
             d=s.nextDouble();
        	 System.out.println("amount");
             double f=s.nextDouble();
             bSavaccount a1=new bSavaccount(a,c,b,d);
             boolean e=a1.withdraw(f);
             if(e==true)
             System.out.println("withdraw successful");
             else
             System.out.println("failed");
        }
        else
        {
        System.out.println("amount");
        double f=s.nextDouble();
        bSavaccount a1=new bSavaccount(a,c,b,d);
        boolean e=a1.withdraw(f);
        if(e==true)
        System.out.println("withdraw successful");
        else
        System.out.println("failed");
        }
	}

}
