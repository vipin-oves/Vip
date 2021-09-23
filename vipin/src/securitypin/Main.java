package securitypin;

import java.util.Scanner;

public class Main {
        public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Generate your Security Code");
        String code = sc.next();
        int count=0,count1=0,count2=0;
        if(code.length()<8)
        {
        System.out.println("Code length should not be less than 8 characters");
        }
        else {
       for(int i=0;i<code.length();i++)
       {
    	  char ch=code.charAt(i);
    	
    	   if(Character.isUpperCase(ch))
    	   {
    		   count++;
    	   }
    	   else if(Character.isLowerCase(ch))
    	   {
    		   count1++;
    	   }
    	   else if(code.contains("@")|| code.contains("*")||code.contains("#"))
    	   {
    		   count2++;
    	   }
       }
        if(count!=0 && count1!=0 && count2!=0)
        System.out.println("Security Code Generated Successfully");
        else if(count==0 || count1==0 || count2==0)
        System.out.println("Invalid Security Code, Try Again!");
 
    }
        }

}

