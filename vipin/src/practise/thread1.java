package practise;

import java.io.*;
public class thread1 extends Thread   {
	public void run ()
	{  try {
		thread t1=new thread();
		String str=t1.getValue();
		StringBuffer alpha = new StringBuffer();
		 System.out.println("You entered "+ str+"\n");
		for (int i=0; i<str.length(); i++)
				{       
			             if(Character.isAlphabetic(str.charAt(i)))
			                alpha.append(str.charAt(i)+" ");
			 }
				System.out.println("Alphabets are "+alpha+"\n");
				Thread.sleep(10000);
	}
	 catch(IOException | InterruptedException ex){
	        System.out.println (ex.toString());
	        System.out.println("Could not find file ");
	    }

}
}
