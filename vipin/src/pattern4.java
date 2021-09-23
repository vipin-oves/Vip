import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);   
		System.out.print("enter 1 for while 2 for for loop");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
		{
			 int i=1;
			 while(i<=3)
		      {
		       for(int j=1;j<=3;j++)
		    	   if(i==j)
		   
		    		   System.out.print("1");
		    	   
		    	   else
		    		   System.out.print("0");

		            System.out.println();
		            i++;
		      }
			break;
		}
		case 2:
		{
		  for(int i=1;i<=3;i++)
	      {
	       for(int j=1;j<=3;j++)
	    	   if(i==j)
	   
	    		   System.out.print("1");
	    	   
	    	   else
	    		   System.out.print("0");

	            System.out.println();
	      }
		  break;
	}

}
	}
}

