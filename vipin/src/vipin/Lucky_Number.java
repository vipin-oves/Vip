package vipin;

import java.util.Scanner;

public class Lucky_Number {

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
	        System.out.print("Enter the car no:");
	        int number=s.nextInt();
	        if(number<1000 || number>9999)
	        {
	            System.out.println(number+" is not a valid car number");
	        }
	        else
	        {int sum=0;
	            while(number>0)
	            {
	                sum+=number%10;
	                number/=10;
	            }
	            if(sum%3==0 || sum%5==0 || sum%7==0)
	            {
	                System.out.println("LUCKY Number");
	            }
	            else
	            {
	                System.out.println("Sorry, its not my lucky number");
	            }
	        }
	}

}
