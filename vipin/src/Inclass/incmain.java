package Inclass;

import java.util.Scanner;

public class incmain {

	public static void main(String[] args) {
		  inc out = new inc();
		    inc.Address in = out.new Address();
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Permanent Address:");
		    System.out.println("Enter House name : ");
			in.setname(sc.next());
			System.out.println("Enter Street name : ");
			in.setstreet(sc.next());
			System.out.println("Enter City name : ");
			in.setcity(sc.next());
			System.out.println("Enter State name : ");
			in.setstate(sc.next());
			System.out.println("Enter Temporary Address:");
		    System.out.println("Enter House name : ");
			in.setname(sc.next());
			System.out.println("Enter Street name : ");
			in.setstreet(sc.next());
			System.out.println("Enter City name : ");
			in.setcity(sc.next());
			System.out.println("Enter State name : ");
			in.setstate(sc.next());
			System.out.println("permanent Address: " + out.getpermAddress());
	}

}
