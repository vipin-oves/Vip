package EHandlling;

import java.util.Scanner;

public class DivEH {
	 public String divide(int n1, int n2)
	    {
	        int val =0 ;
	        String str = "";
	        
	        try
	        {
	            val= n1/n2;
	            str = ("The answer is "+ val);
	        }
	        catch(ArithmeticException e)
	        {
	            str = "Division by zero is not possible";
	        }
	        finally
	        {
	            return(str+". Thanks for using the application.");    
	        }
	    }

	public static void main(String[] args) {
	
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the numbers");
		        int num1 =  sc.nextInt();
		        int num2 =  sc.nextInt();
		        DivEH div = new DivEH();
		        System.out.print(div.divide(num1,num2));
		    }
		}
