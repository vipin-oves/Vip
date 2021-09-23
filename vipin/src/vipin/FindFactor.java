package vipin;

import java.util.Scanner;

public class FindFactor {

	public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.print("Enter a number : ");				
				int number =Math.abs(s.nextInt());
				if(number==0)
				{
					System.out.print("No Factors.");
				}
				else
				{
				System.out.print("Factors are : ");
				System.out.print("1");
				for(int i = 2 ; i <= number ; i++)
				{
					if(number % i == 0)
						System.out.print(", "+i);
				}

				}
				}

}
