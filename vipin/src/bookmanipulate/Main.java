package bookmanipulate;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library l1=new Library();
		String author;
		String bname;
		do
		{
		System.out.println(" \n1.Add Book\n2.Display all book detials\n3.Search book by author\n4.Count number of books - by book name\n5.Exit \nEnter your choice: ");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
		{
			l1.addBook();
			break;
		}
		case 2:
		{
			
			l1.viewallbooks();
			break;
		}
		case 3:
		{
			System.out.println("Enter Author name : ");
			 author = sc.next();
			l1.viewbyauthor(author);
			break;
		}
		case 4:
		{
			 System.out.println("Enter book name : ");
				bname = sc.next();
				l1.bookcount(bname);
				break;
				
		}
		case 5:
		{
			System.exit(0);
		}
		}
		}while(true);
		
		

	}

}
