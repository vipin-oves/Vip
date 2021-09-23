package Luckyn;

import java.util.Scanner;

public class LuckyMain {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        System.out.print("Enter the car no:");
        int number=s.nextInt();
		FindLucky l=new FindLucky();
		l.ReadNumber(number);
		l.PrintLuckyNumber();
	}

}
