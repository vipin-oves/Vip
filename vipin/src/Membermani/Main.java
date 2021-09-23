package Membermani;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library l1=new Library();
		String address;
		do
		{
		System.out.println(" \n1.Add Members\n2.View all members\n3.Search Members by address\n4.Exit \nEnter your choice: ");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
		{
			l1.addmember();
			break;
		}
		case 2:
		{
			l1.viewallmember();
			break;
		}
		case 3:
		{
			System.out.println("Enter Address : ");
			 address = sc.next();
			l1.viewbyaddress(address);
			break;
		}
		
		case 4:
		{
			System.exit(0);
		}
		}
		}while(true);
		

	}

}
