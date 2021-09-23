package visitorsbook;
import java.io.File;
import java.util.*;
public class main {
	
	
	        public void Read(){
	        	Filemanager f1=new Filemanager();
	            Scanner s = new Scanner(System.in);
	            String pnumber;
	            String name;
	            String id;
	            System.out.println("Enter Name");
	            name=s.next();
	            do 
	        	{
	            System.out.println("Enter Phone Number");
	             pnumber=s.next();
	        	}while(f1.numbervalidate(pnumber)==false);
	            do
	            {
	        	
	            System.out.println("Enter Email");
	            id= s.next();
	            }while(f1.emailvalidate(id)==false);
	            File x =Filemanager.createFile();
	            Filemanager.writeFile(x,name+","+pnumber+","+id);
	            System.out.println("Do you want to enter another record(yes/no)");
	            String choice=s.next();
	            if(choice.equals("yes")){
	                Read();
	            }
	            if(choice.equals("no"))
	           {String []q=Filemanager.readFile(x);
	           String pl[]=q[0].split(";");
	            for(int i=0;i<pl.length;i++)
	            {
	                System.out.println(pl[i]);
	                   }

	                    System.exit(0);
	            }

	        }

	        public static void main(String[] args) 
	        {
	            main m=new main();
	            m.Read();



	        }

	    }

