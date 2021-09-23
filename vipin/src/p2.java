import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();  
		System.out.print("Enter third number- ");  
		int c= sc.nextInt();  
		if(a > b) 
	      {
	         if(a > c)
	         {
	            System.out.println(a + " is largest number.");
	         }
	         else
	         {
	            System.out.println(c + " is largest number.");
	         }
	      } 
	      else 
	      {
	         if(b > c)
	         {
	            System.out.println(b + " is largest number.");
	         }
	         else
	         {
	            System.out.println(c + " is largest number.");
	         }
	      }
		

	}

}
