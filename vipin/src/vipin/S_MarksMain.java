package vipin;

import java.util.Scanner;

public class S_MarksMain {

	public static void main(String[] args) 
		{
	        StudEnt s1=getStudentDetails();
	        s1.calculateAvg();
	        s1.findGrade();
	        System.out.println("Id:" +s1.getId());
	        System.out.println("Name:" +s1.getName());
	        System.out.println("Average:"+String.format("%.2f",s1.getAverage()));
	        System.out.println("Grade:" +s1.getGrade());
	    }
	    public static StudEnt getStudentDetails()
	    {
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter the id:");
	        int id=Integer.parseInt(s.nextLine());
	        System.out.println("Enter the Name:");
	        String name=s.nextLine();
	        System.out.println("Enter the no of subjects:");
	        int n=s.nextInt();
	        if(n<=0)
	        {
	            while(n<=0)
	            {
	                System.out.println("Invalid number of subject");
	                System.out.println("Enter the no of subjects");
	                n=s.nextInt();
	            }
	        }
	        int arr[]=new int[n];
	        for(int a=0;a<n;a++)
	        {
	            System.out.println("Enter mark for subject "+(a+1)+":");
	            int b=s.nextInt();
	            if(b<0||b>100)
	            {
	                System.out.println("Invalid Mark");
	                System.out.println("Enter mark for subject "+(a+1)+":");
	                b=s.nextInt();
	            }
	            arr[a]=b;
	        }
	        StudEnt obj=new StudEnt(id,name,arr);
	        obj.setId(id);
	        obj.setName(name);
	        return obj;

	}

}
