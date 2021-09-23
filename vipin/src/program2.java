import java.util.Scanner;
public class program2 {

	public static void main(String[] args) {
		int factorial = 1;
        int i = 1;
        System.out.print("Enter number for factorial "); 
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();  
        while(i<=n)
        {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of "+n+" is: "+factorial);

	}

}
