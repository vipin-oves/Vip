package vipin;

import java.util.Scanner;


public class HostelerMain {
	   public static Hosteler getHostellerDetails()
	    {

		   	Hosteler h1=new Hosteler();
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter the Details:");
	        System.out.println("Student Id");
	        h1.setStudentId(s.nextInt());
	        System.out.println("Student Name");
	        s.nextLine();
	        String n1=s.nextLine();
	        System.out.println("Department Id");
	        int c1=s.nextInt();
	        System.out.println("Gender");
	        s.nextLine();
	        String g1=s.nextLine();
	        System.out.println("Phone Number");
	        String p1=s.nextLine();
	        System.out.println("Hostel Name");
	        String f1=s.nextLine();
	        System.out.println("Room Number");
	        int r1=s.nextInt();
	   
	        h1.setName(n1);
	        h1.setDepartmentId(c1);
	        h1.setGender(g1);
	        h1.setPhone(p1);
	        h1.setHostelName(f1);
	        h1.setRoomNumber(r1);
	        System.out.println("Modify Room Number(Y/N)");
	        char i=s.next().charAt(0);
	        if(i=='Y' || i=='y')
	        {
	            System.out.println("New Room Number");
	            int rn1=s.nextInt();
	            h1.setRoomNumber(rn1);
	        }
	        System.out.println("Modify Phone Number(Y/N)");
	        char j=s.next().charAt(0);
	        if(j=='Y' || j=='y')
	        {
	            System.out.println("New Phone Number");
	            s.nextLine();
	            String pn1=s.nextLine();
	            h1.setPhone(pn1);
	        }
	        return h1;
	    }
	    public static void main(String args[])
	    {
	        Hosteler h2=new Hosteler();
	        h2=getHostellerDetails();
	        System.out.println("The Student Details");
	        System.out.println(h2.getStudentId()+" "+h2.getName()+" "+h2.getDepartmentId()+" "+h2.getGender()+
	        " "+h2.getPhone()+" "+h2.getHostelName()+" "+h2.getRoomNumber());

	}

}
