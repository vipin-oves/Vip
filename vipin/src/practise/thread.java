package practise;
import java.io.*;


public class thread {
	public synchronized String getValue() throws IOException{
	{
		FileReader fr = new FileReader("E:\\vk1.txt");
		BufferedReader br = new BufferedReader(fr);
		String str=br.readLine();
		 return str;
		 
		
	}
			 
	}

	public static void main(String[] args) 
	{

		
		thread1 t1=new thread1();  
		  thread2 t2=new thread2();  
		  
		  t1.start();  
		  t2.start();  
		
				
	


	}
}
