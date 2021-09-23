package vipin;

import java.util.Scanner;

public class array_comp {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
	        System.out.print("Enter the size for First array:");
	        int size1=s.nextInt();
	        int flag=0;
	        if(size1>0)
	        {
	            int[] arr1=new int[size1];
	            
	            System.out.print("Enter the elements for array 1:");
	            for(int i=0;i<size1;i++)
	            {
	                arr1[i]=s.nextInt();
	            }
	            System.out.print("Enter the size for array 2:");
	            int size2=s.nextInt();
	            if(size2>0)
	            {
	                    int[] arr2=new int[size2];
	                    
	                    System.out.print("Enter the elements for Second array:");
	                    for(int i=0;i<size2;i++)
	                    {
	                        arr2[i]=s.nextInt();
	                    }
	                    
	                    if(size1==size2)
	                    {
	                        for(int i=0; i<size1;i++)
	                        {
	                            if(arr1[i]>=arr2[i])
	                            {
	                                flag++;
	                            }
	                        }
	                        
	                        if(flag==size1)
	                        {
	                            System.out.print("Arrays are Compatible");
	                        }
	                        else
	                        {
	                            System.out.print("Arrays are not Compatible");
	                        }
	                        
	                    }
	                    else
	                    {
	                        System.out.print("Arrays are Not Compatible");
	                    }
	            }
	            else
	            {
	                System.out.print("Invalid array size");
	            }
	        }
	        else
	        {
	            System.out.print("Invalid array size");
	        }

	}

}
