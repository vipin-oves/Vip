package fileoperations;
import java.io.*;
import java.util.Scanner;

public class fileinput {

	public static void main(String[] args)  throws IOException {

				Scanner sc = new Scanner(System.in);
				FileWriter fw = new FileWriter("C:\\\\Users\\\\Administrator\\\\eclipse-workspace\\\\vipin\\files\\Course.txt", true);
				System.out.println("Enter no of course: ");
				int no_course = sc.nextInt();
				if(no_course>0)
				{
					System.out.println("Enter course name: ");
					String crs[]=new String[no_course];
					for(int i=0;i<no_course;i++)
					{
						crs[i]=sc.next();		
						fw.write(crs[i]+"\n");
					}
					System.out.println(no_course +" courses added successfully");
					}			
				else
				{
					System.out.println("Invalid range ");
				}
				
				
		
				fw.close(); 
				
				sc.close();
			}


	}


