package vipin;

import java.util.Scanner;

public class Movie_Ticket_Calculation {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int no_of_Ticket;
			double total = 0,cost;
			String refresh, c_code , circle_info;
			System.out.print("Enter the no of ticket:");
			no_of_Ticket = s.nextInt();
			if (no_of_Ticket < 5 || no_of_Ticket > 40)
			{
			System.out.println("Minimum of 5 and Maximum of 40 tickets");
			System.exit(0);
			}
			System.out.print("Do you want refreshment:");
			refresh = s.next();
			System.out.print("Do you have coupon code:");
			c_code = s.next();
			System.out.print("Enter the circle:");
			circle_info = s.next();
			if(circle_info.charAt(0) == 'k' || circle_info.charAt(0) == 'K')
			{
				cost=75*no_of_Ticket;
			}
			else if(circle_info.charAt(0) == 'q' || circle_info.charAt(0) == 'Q')
			{
				cost=150*no_of_Ticket;
			}
			else
			{
				System.out.println("Invalid Input");
			return;
			}
			total=cost;
			if(no_of_Ticket>20)
			{
				cost= cost - ((0.1)*cost);
				total=cost;
			}
			if(c_code.charAt(0)== 'y' || c_code.charAt(0)== 'Y')
			{	
				total= cost - ((0.02)*cost);
			}	
			if(refresh.charAt(0)== 'y' || refresh.charAt(0)== 'Y')
			{	
			total += (no_of_Ticket*50);
			}
			System.out.format("Ticket cost:%.2f",total);
	}
}
