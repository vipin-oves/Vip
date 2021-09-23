package Phonebookmanipulation;

import java.util.Scanner;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         pbook p=new pbook();
        do
         {
             System.out.println(" Menu\n 1.Add Contact\n 2.Display all contacts\n 3.Search contact by phone\n 4.Remove contact\n 5.Exit");
             System.out.print("Enter your choice: ");
             int n=sc.nextInt();
             switch(n)
             {
             case 1:
             {
                 contact obj=new contact();
                 System.out.println("Add a contact: ");
                 System.out.print("Enter the First Name: ");
                 obj.setfName(sc.next());
                 System.out.print("Enter the Last Name: ");
                 obj.setlName(sc.next());
                 System.out.print("Enter the Phone No. : ");
                 obj.setpNumber(sc.nextLong());
                 System.out.print("Enter the Email: ");
                 obj.setEmailId(sc.next());
                 p.addContact(obj);
                 break;
             }
             
             case 2:
             {
                 List<contact>c=p.viewAllContacts();
                 System.out.println("=========================");
                 for(contact c1:c)
                 {
                     System.out.println("First Name:"+c1.getfName());
                     System.out.println("Last Name:"+c1.getlName());
                     System.out.println("Phone No.:"+c1.getpNumber());
                     System.out.println("Email:"+c1.getEmailId());
                     System.out.println("=========================");
                     
                 }
                 break;
             }
             case 3:
             {
                 System.out.print("Enter the Phone number to search contact:");
                 Long n1=sc.nextLong();
                 contact c=p.viewContactusingPhone(n1);
            }
                 
                 
       
             case 4:
             {
                 System.out.print("Enter the Phone number to remove:");
                 Long n1=sc.nextLong();
                 System.out.println("Do you want to remove the contact(Y for yes N for no):");
                 char ch=sc.next().charAt(0);
                 if(ch=='Y'||ch=='y')
                 {
                     boolean f1=p.deleteContact(n1);
                     if(f1)
                     System.out.println("The contact is successfully deleted");
                     else
                     System.out.println("Contact is not found");
                 }
                 if(ch=='N')
                 {
                     System.out.println("ok");
                 }
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
