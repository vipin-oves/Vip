import java.util.Scanner;

public class primearray {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);  
			int i, Number;
			sc = new Scanner(System.in);
		 
			System.out.print(" Please Enter Number of elements in an array : ");
			Number = sc.nextInt();	
			
			int [] Array = new int[Number];
			
			System.out.print(" Please Enter " + Number + " elements of an Array  : ");
			for (i = 0; i < Number; i++)
			{
				Array[i] = sc.nextInt();
			}     
		 
			System.out.println("\nElements in this Array are");
			for (i = 0; i < Number; i++)
			{
				System.out.print(Array[i] + "\t");
			}
			
	        for (i = 0; i < Number; i++) {
	            int j = 2;
	            int flag= 1;
	            while (j < Array[i]) {
	                if (Array[i] % j == 0) {
	                    flag = 0;
	                    break;
	                }
	                j++;
	            }
	            if (flag == 1) {
	                System.out.println("\n\n " + Array[i] +" is a prime number");
	                }
	            }
	        
	        System.out.print("The factors are:: \n");
	        for (i = 0; i < Number; i++)
	        {
            for (int i1 = 1; i1 <= Array[i]; ++i1) 
            {
            	System.out.print(Array[i]);
          
                if(Array[i] % i1 == 0) 
                System.out.print(i1+" ");
	            }
            System.out.print("\n");
	        }
	}  
}
	
