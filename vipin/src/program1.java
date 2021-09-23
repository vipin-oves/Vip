import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter month number");  
		int a= sc.nextInt();  
		if(a > 12)
		{
		System.out.print("Month Number can only be 1 to 12");
		}
		if(a==1||a==3|a==5||a==7||a==8||a==10||a==12)
		{
			System.out.print("Month has 31 days");
		}
		if(a==2)
		{
			System.out.print("Month has 28 or 29 days depending on year");
		}
		if(a==4||a==3|a==6||a==9||a==11)
		{
				System.out.print("Month has 30 days");
		}
	}

}
