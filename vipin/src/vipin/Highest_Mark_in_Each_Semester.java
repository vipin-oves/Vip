package vipin;

import java.util.Scanner;

public class Highest_Mark_in_Each_Semester {

	public static void main(String[] args) 
	{
		 Scanner s = new Scanner (System.in);
	        System.out.println("Enter no of semester:");
	        int semester = s.nextInt();
	        int array[] = new int [semester];
	        for(int i=0;i<semester;i++)
	        {
	            System.out.println("Enter no of subjects in "+(i+1)+" semester:");
	            array[i]=s.nextInt();
	        }
	        int maximum[] = new int[semester];
	        for(int i=0;i<semester;i++)
	        {
	            System.out.println("Marks obtained in semester "+(i+1)+":");
	            int max = s.nextInt();
	            if(max<0||max>100)
	            {
	                System.out.println("You have entered invalid mark.");
	                System.exit(0);
	            }
	            for(int j=1;j<array[i];j++)
	            {
	                int marks=s.nextInt();
	                if(marks<0||marks>100)
	                {
	                    System.out.println("You have entered invalid mark.");
	                    System.exit(0);
	                }
	                if(max<marks)
	                max=marks;
	            }
	            maximum[i]= max;   
	        }
	        for(int i=0;i<semester;i++)
	        {
	            System.out.println("Maximum mark in "+(i+1)+" semester:"+maximum[i]);
	        }
	}
}
