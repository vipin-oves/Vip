package vipin;

import java.util.Scanner;

class Student1
{
    private int sId;
    private String sName, sAddress, cName;
    
    public Student1(int sId, String sName, String sAddress)
    {
    	this.sId=sId;
    	this.sName=sName;
    	this.sAddress=sAddress;
        this.cName="NIT";
    }
    
    public Student1(int sId, String sName, String sAddress, String cName)
    {
        this(sId, sName, sAddress);
        this.cName=cName;
    }
    
    public int getStudentId()
    {
        return this.sId;
    }
    
    public String getStudentName()
    {
        return this.sName;
    }
    
    public String getStudentAddress()
    {
        return this.sAddress;
    }
    
    public String getCollegeName()
    {
        return this.cName;
    }
}
public class studentdetails_OOP {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	       System.out.println("Enter Student's Id:");
	       int sId=s.nextInt();
	       s.nextLine();
	       
	       System.out.println("Enter Student's Name:");
	       String sName=s.nextLine();
	       
	       System.out.println("Enter Student's address:");
	       String sAddress=s.nextLine();
	       
	       while(true)
	       {
	            System.out.println("Whether the student is from NIT(Yes/No):");
	            String answer=s.nextLine();
	       
	            if(answer.equalsIgnoreCase("yes"))
	            {
	                Student1 s1 = new Student1(sId, sName, sAddress);
	                System.out.println("Student id:"+s1.getStudentId());
	                System.out.println("Student name:"+s1.getStudentName());
	                System.out.println("Address:"+s1.getStudentAddress());
	                System.out.println("College name:"+s1.getCollegeName());
	                break;
	            }
	           
	            else if(answer.equalsIgnoreCase("no"))
	            {       
	                System.out.println("Enter the college name:");
	                String cname=s.nextLine();
	                
	                Student1 s1 = new Student1(sId, sName, sAddress, cname);
	                
	                System.out.println("Student id:"+s1.getStudentId());
	                System.out.println("Student name:"+s1.getStudentName());
	                System.out.println("Address:"+s1.getStudentAddress());
	                System.out.println("College name:"+s1.getCollegeName());
	                break;
	            }
	            
	            else
	            {
	                System.out.println("Wrong Input");
	            }
	       }
	}

}
