package vipin;

import java.util.Scanner;

public class Bill_Generation {

	public static void main(String[] args) {
		  	Scanner s=new Scanner(System.in);
	        System.out.print("Enter the no of pizzas bought:");
	        int pizza=s.nextInt();
	        System.out.print("Enter the no of puffs bought:");
	        int puffs=s.nextInt();
	        System.out.print("Enter the no of cool drinks bought:");
	        int c_drinks=s.nextInt();
	        
	        System.out.println("==================");
	        System.out.println("Bill Details");
	        System.out.println("No of pizzas: "+pizza);
	        System.out.println("No of puffs: "+puffs);
	        System.out.println("No of cooldrinks: "+c_drinks);
	        int total=pizza*100+puffs*20+c_drinks*10;
	        System.out.println("------------------------");
	        System.out.println("Total price="+total);
	        System.out.println("ENJOY THE SHOW!!!!!!!!!!");

	}

}
