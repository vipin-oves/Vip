package vipin;

import java.util.Scanner;

public class Cumulative_sum {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        
	        System.out.print("Enter number of elements: ");
	        int size = s.nextInt();
	        int[] array1 = new int[size];
            int[] array2 = new int[size];
	        
	        if(size>0)
	        {
	            System.out.println("Enter the elements: ");  
	            int sum = 0;
	            for(int i=0;i<size;i++)
	            {
	                array1[i]=s.nextInt();
	                sum=array1[i]+sum;
	                array2[i]=sum;
	            }
	            System.out.println("\nCumulative sum is:-");  
	            for(int i = 0;i<size;i++)
	            {
	                System.out.print(array2[i]+" ");
	            }
	        }
	        else
	        {
	            System.out.println("Invalid Range");
	        }

	}

}
