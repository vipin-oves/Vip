package practise;

import java.io.*;
public class thread2 extends Thread   {
	public void run ()
	{  try {
		thread t1=new thread();
		String str=t1.getValue();
		StringBuffer num = new StringBuffer();
		for (int i=0; i<str.length(); i++)
				{       
			             if(Character.isDigit(str.charAt(i)))
			                num.append(str.charAt(i)+" ");
			 }
				System.out.println("Numbers are "+num+"\n");
				Thread.sleep(10000);
	}
	 catch(IOException | InterruptedException ex){
	        System.out.println (ex.toString());
	        System.out.println("Could not find file ");
	    }

}
}
