package Unique;
import java.util.Scanner;
public class uniqueMain {

	public static void main(String[] args) {
		uniquen n=new uniquen();
		System.out.println("Enter a sentence:");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		str=str.toLowerCase();
		n.ReadInput(str);
		n.PrintOutput();

	}
}
