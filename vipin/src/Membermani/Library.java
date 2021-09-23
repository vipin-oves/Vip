package Membermani;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Library {
	int n=0;
	ArrayList<member>  memberlist = new ArrayList<member>();
	member mem = null;
	Scanner sc = new Scanner(System.in);
	
	 void addmember()
	{
		mem = new member();
		System.out.println("Enter the Id: ");
		mem.setmemid(sc.nextInt());
		System.out.println("Enter the Member name: ");
		mem.setmemberName(sc.next());
		System.out.println("Enter the address: ");
		mem.setaddress(sc.next());
		
		memberlist.add(mem);
		n++;	
	}
	void viewallmember()
	{
		int count=0;
		 Collections.sort(memberlist);
		for(member mem : memberlist)
		{
			System.out.println("Member Id: " + mem.getmemid());
			System.out.println("Member Name : " + mem.getmemberName());
			System.out.println("Address : " + mem.getaddress());
		}
		if(count==0)
			System.out.println("No data in the list exists");
}
	void viewbyaddress(String address)
	 {
			
			int flag=0;
			 Collections.sort(memberlist);
			for(member mem : memberlist)
			{
				if(mem.getaddress().equals(address))
				{
					System.out.println("Member Id: " + mem.getmemid());
					System.out.println("Member Name : " + mem.getmemberName());
					System.out.println("Address : " + mem.getaddress());
					flag++;
				}
			}
			if(flag==0)
				System.out.println("No Such address exists");
			if(n==0)
				System.out.println("The list is empty");
}
}
