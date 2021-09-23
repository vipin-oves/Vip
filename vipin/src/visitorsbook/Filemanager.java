package visitorsbook;
import java.io.*;
import java.util.*;
public class Filemanager {

	    static public File createFile()
	    {
	        File f =new File("visitors.txt");
	try{     
		f.createNewFile();}
	catch (IOException e)   
	{  
	e.printStackTrace();  
	}      

	    return f;
	    }
  
	    static public void writeFile(File f, String record)
	    {    try { 


	            BufferedWriter out = new BufferedWriter( 
	                   new FileWriter(f.getName(), true)); 
	            out.write(record+";"); 
	            out.close(); 
	        } 
	        catch (IOException e) { 
	            System.out.println("exception occoured" + e); 
	        } 

	    } 
	    static public String[] readFile(File f)
	    {

	        List<String> visit = new ArrayList<String>();
	        try{
	      File myObj = new File(f.getName());
	      Scanner mr = new Scanner(myObj);
	      while (mr.hasNextLine()) {

	   
	        visit.add(mr.nextLine());

	      }

	      mr.close();
	      }
	       catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	    String[] tokenArray = visit.toArray(new String[0]);
	    return tokenArray;
	    }
	    public boolean  numbervalidate(String phone)
	    {
	    	
	    	if(phone.length()==10)
	    	{
	    		if(phone.charAt(0)=='7'||phone.charAt(0)=='8'||phone.charAt(0)=='9')
	    		{
	    			 return true;
	    		}
	    		else
	    		{
	    			 System.out.println("Number can only start with 7 or 8 or 9");
	    			 return false;
	    		}
	    	}
	    	else
	    	{
	    		 System.out.println("phone number needs to be of 10 digits");
	    		 return false;
	    	}
	    }
	    public boolean  emailvalidate(String email)
	    {
	    	if(email.contains("@")&&email.contains(".com"))
	    	{
	    		 return true;
	    	}
	    	else
	    	{
	    		System.out.println("email is not valid");
	    		return false;
	    	}
	    }
	 }

