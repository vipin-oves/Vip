package Phonebookmanipulation;
import java.util.*;
public class pbook {
	  private List<contact> phoneBook=new ArrayList<contact>();
	    public void setPhoneBook(List<contact>p)
	    {
	        phoneBook=p;
	    }
	    public List<contact>getPhoneBook()
	    {
	        return phoneBook;
	    }
	    public void addContact(contact c)
	    {
	        phoneBook.add(c);
	    }
	    public List<contact> viewAllContacts()
	    {
	    	if(phoneBook.isEmpty())
	    	{
	    	System.out.println("No contacts to Display:");
	    	}
	    	else
	    	{
	    	System.out.println("The contacts in the List are:");
	    	}
	    	return phoneBook;
	    }
	    public contact viewContactusingPhone(long phoneNumber)
	    {
	    	int count=0;
	        contact c=new contact();
	        if(phoneBook.isEmpty())
	    	{
	    	System.out.println("No contacts to Display:");
	    	}
	        for(contact c1:phoneBook)
	        {
	            if(c1.getpNumber()==phoneNumber)
	            {
	            	 System.out.println("The contact is:");
	                 System.out.println("First Name:"+c.getfName());
	                 System.out.println("Last Name:"+c.getlName());
	                 System.out.println("Phone No.:"+c.getpNumber());
	                 System.out.println("Email:"+c.getEmailId());
	            }
	            else
	            {
	            	count++;
	            }
	        }
	        if(count!=0)
	        {
	        	System.out.println("Not found ");
	        }
			return c;
	      }
	    public boolean deleteContact(long phoneNumber)
	    {
	        boolean remove=false;
	        for(contact c:phoneBook)
	        {
	            if(c.getpNumber()==phoneNumber)
	            {
	                remove=true;
	                phoneBook.remove(c);
	                break;
	            }
	        }
	        return remove;
	    }

}
