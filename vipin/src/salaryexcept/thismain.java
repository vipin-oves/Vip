package salaryexcept;

import java.util.Scanner;

public class thismain {
	 public static emp getCandidateDetails() throws salaryexp{
         emp c = new emp();
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the candidate Details");
         System.out.println("Name");
         c.setName(sc.nextLine());
         System.out.println("Gender");
         c.setGender(sc.nextLine());
         System.out.println("Expected Salary");
         double expsal = sc.nextDouble();
         if(expsal<10000)
         {
             throw new salaryexp("Registration Failed. Salary cannot be less than 10000.");
         }
         c.setExpectedSalary(expsal);
         return c;
     }


	public static void main(String[] args) {
	      try{
	          
	         emp co = thismain.getCandidateDetails(); 
	         if(co != null){
	           System.out.println("Registration Successful");
	       }
	      }
	      catch(salaryexp e){
	          System.out.println(e.getMessage());
	      }

	}

}
