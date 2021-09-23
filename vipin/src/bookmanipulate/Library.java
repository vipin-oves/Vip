package bookmanipulate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Library {

	ArrayList<Book>  booklist = new ArrayList<Book>();
	Book book = null;
	Scanner sc = new Scanner(System.in);
	int n=0;
	
	void addBook()
	{
		book = new Book();
		System.out.println("Enter the isbn no: ");
		book.setisbnno(sc.nextInt());
		System.out.println("Enter the Book name: ");
		book.setbookName(sc.next());
		System.out.println("Enter the author name: ");
		book.setauthor(sc.next());
		
		booklist.add(book);
		n++;	
		
	}
	void viewallbooks()
	{
		int count =0;
		 Collections.sort(booklist);
		for(Book book : booklist)
		{
			System.out.println("ISBN no: " + book.getisbnno());
			System.out.println("Book Name : " + book.getbookName());
			System.out.println("Author name : " + book.getauthor());
			count++;
		}
		if(count==0)
			System.out.println("No data in the list exists");
		
		
	}
	 void viewbyauthor(String author)
	 {
		 Collections.sort(booklist);
			int flag=0;
			for(Book book : booklist)
			{
				if(book.getauthor().equals(author))
				{
					System.out.println("ISBN no: " + book.getisbnno());
					System.out.println("Book Name : " + book.getbookName());
					System.out.println("Author name : " + book.getauthor());
					flag++;
				}
			}
			
			if(flag==0)
				System.out.println("No Such author exists");
			if(n==0)
				System.out.println("The list is empty");
			
		}
	 int bookcount(String bname)
	 {
		 Collections.sort(booklist);
		int flag=0;
		int count=0;
		for(Book b : booklist)
		{
			if(b.getbookName().equals(bname))
			{
				/*System.out.println("ISBN no: " + book.getisbnno());
				System.out.println("Book Name : " + book.getbookName());
				System.out.println("Author name : " + book.getauthor());
				*/
				count++;
				flag++;
			}
		}
		System.out.println("number of books"+count);
		if(flag==0)
			System.out.println("No Such book exists");
		if(n==0)
			System.out.println("The list is empty");
		return count;
		
	 }
}
