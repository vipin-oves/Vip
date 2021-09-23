package ValidatePin;

import java.util.Scanner;

public class Main {
	 public static void main(String a[]){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Pan number");
	        String code = sc.next();
	        int count=0,count1=0,count2=0;
	        if(code.length()<10)
	        {
	        System.out.println("Number length should not be less than 10 characters");
	        }
	        else {
	       for(int i=0;i<5;i++)
	       {
	    	  char ch=code.charAt(i);
	    	
	    	   if(Character.isUpperCase(ch))
	    	   {
	    		   count++;
	    	   }
	    	   for(i=5;i<9;i++)
	    	   {
	    		 char ch1=code.charAt(i);
	    	   if(Character.isDigit(ch1))
	    	   {
	    		   count1++;
	    	   }
	    	   }
	    	   for(i=9;i<10;i++)
	    	   {
	    		char ch2=code.charAt(i);
	    		if(Character.isUpperCase(ch2))
	    	   {
	    		   count2++;
	    	   }
	       }
	       }
	        if(count!=0 && count1!=0 && count2!=0)
	        System.out.println("Valid Pan Number");
	        else if(count==0 || count1==0 || count2==0)
	        System.out.println("Invalid Pan Number");
	 
	    }
}
}
