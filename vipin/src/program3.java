import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
	        System.out.print("Enter the number "); 
	        Scanner sc= new Scanner(System.in);
	        int n= sc.nextInt();  
	        int s=0;
	        while(n>0)
	        {
	        int r=n%10;
	        s+=r;
	        n=n/10;
	        }
	        System.out.println("sum of digits are "+s);
	}

}
