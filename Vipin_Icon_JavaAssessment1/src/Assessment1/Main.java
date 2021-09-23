package Assessment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch="";
		do
		{
		System.out.println("1.Savings Account \n2.Current Account \nEnter your choice:");
		int choice = sc.nextInt();
		if(choice == 1){
			System.out.println("Enter the Account number: ");
			String ano1 = sc.next();
			System.out.println("Enter the Customer Name: ");
			String cname1 = sc.next();
			System.out.println("Enter the Balance amount: ");
			double balance = sc.nextDouble();
			System.out.println("Enter the number of years: ");
			float no_of_years = sc.nextInt();
			CAccount c = new CAccount(ano1, cname1, balance);
			
			System.out.println("Customer Name "+c.getCustomerName());
			System.out.println("Account Number "+c.getAccountNumber());
			System.out.println("Account Balance "+c.getBalance());
			System.out.println("Maintenance Charges for Savings Account is "+c.calculatemaintenancecharge(no_of_years));
			
		}
		else if(choice == 2){
			System.out.println("Enter the Account number: ");
			String ano2 = sc.next();
			System.out.println("Enter the Customer Name: ");
			String cname2 = sc.next();
			System.out.println("Enter the Balance amount: ");
			double balance = sc.nextDouble();
			System.out.println("Enter the number of years: ");
			float no_of_years = sc.nextInt();
			SAccount s = new SAccount(ano2, cname2, balance);
			
			System.out.println("Customer Name: "+s.getCustomerName());
			System.out.println("Account Number: "+s.getAccountNumber());
			System.out.println("Account Balance: "+s.getBalance());
			System.out.println("Maintenance Charges for Current Account is: "+s.calculatemaintenancecharge(no_of_years));
		}
		System.out.println("Want to continue [y/n]");
		ch=sc.next();
		}while(ch.equals("y"));	
		

	}

}
