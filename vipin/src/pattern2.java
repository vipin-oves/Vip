import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);   
		System.out.print("enter 1 for while 2 for for loop");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
		{
			int i=5;
				 while(i>=1)
					{
					for(int j=1;j<=i;j++)
					{
					System.out.print(i+" ");
					}
					System.out.println();
					i--;
					}
			break;
			
		}
		case 2:
		{
		 for(int i=5;i>=1;i--)
		{
		for(int j=1;j<=i;j++)
		{
		System.out.print(i+" ");
		}
		System.out.println();
		}
		 break;

	}
		}
	}

}
