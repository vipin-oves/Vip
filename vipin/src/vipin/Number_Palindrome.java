package vipin;

import java.util.Scanner;

public class Number_Palindrome {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	     System.out.print("Input a number: ");
	     int n = s.nextInt();
	     int sum = 0, r;
		 int temp = n;    
	     while(n>0)
		   {    
	        r = n % 10;   
	        sum = (sum*10)+r;    
	        n = n/10;    
	       }    
	      if(temp==sum)    
	        System.out.println("Palindrome");    
	      else    
	        System.out.println("Not a palindrome");  

	}

}
