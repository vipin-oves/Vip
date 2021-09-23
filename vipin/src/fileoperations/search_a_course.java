package fileoperations;
import java.io.*;
import java.util.Scanner;

public class search_a_course {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileReader fr = new FileReader("C:\\\\Users\\\\Administrator\\\\eclipse-workspace\\\\vipin\\files\\Course.txt");
		BufferedReader br = new BufferedReader(fr);
		 System.out.println("Enter the course to be searched:");
		String course = sc.nextLine();
		String s;
	  
	   String[] chars=null;
	   
	   int flag=0;
			 while((s=br.readLine())!=null)
			 {
				 chars=s.split("\n");
				 for(String word:chars)
				 {
					 if(word.equals(course))
					 {
						 flag++;
					 }
				 }
			 }

	   if(flag!=0)
       {
           System.out.println(course+" course is available");
       }
       else
       {
           System.out.println(course+" course is not available");
       }
	   fr.close();

}
	
}
