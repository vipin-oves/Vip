package vipin;
import java.util.Scanner;

class Ticket1{
private int tid;
private int price;
private static int availableTickets;

public void setTicketid(int a)
{
    tid=a;
}
public void setPrice(int a){
    price=a;
}
public static void setAvailableTickets(int count) 
{
if(count > 0)
availableTickets=count;
}

public int getTicketid()
{
    return tid;
}
public int getPrice()
{
    return price;
}
public static int getAvailableTickets()
{
    return availableTickets;
}
public int calculateTicketCost(int nooftickets) 
{
if (nooftickets > availableTickets) 
	{System.out.println("INVALID NUMBER OF TICKETS!!!!!!!");
    return -1;
    }
availableTickets -= nooftickets;
return price * nooftickets;
}   


}

public class ticketPriceOOP {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		    Ticket1 t=new Ticket1();
		    System.out.println("Enter no of bookings:");
		    int no=s.nextInt();
		    System.out.println("Enter the available tickets:");
		    int avail=s.nextInt();
		    t.setAvailableTickets(avail);
		    while(no>0)
		    {
		    System.out.println("Enter the ticketid:");
		    int id=s.nextInt();
		    t.setTicketid(id);
		    System.out.println("Enter the price:");
		    int price=s.nextInt();
		    t.setPrice(price);
		    System.out.println("Enter the no of tickets:");
		    int notick=s.nextInt();
		    System.out.println("Available tickets:"+t.getAvailableTickets());
		    System.out.println("Total amount:" + t.calculateTicketCost(notick));
		    System.out.println("Available ticket after booking:" + t.getAvailableTickets());
		    
		    no--;

	}

}
}
