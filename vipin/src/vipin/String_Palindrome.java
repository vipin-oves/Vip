package vipin;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		  String str, rev = "";
	      Scanner s = new Scanner(System.in);
	      System.out.println("Enter a word:");
	      str = s.nextLine(); 
	      String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}";
	  		boolean found = false;
	  		for(int i=0; i<specialCharacters.length(); i++){
	  	    if(str.contains(Character.toString(specialCharacters.charAt(i)))){
	  	        found = true;
	  	        System.out.println("Invalid Input");
	  	        break;
	  	    }
	  	}
	          if(found == false)
	          {
	      String str1=str.toLowerCase();
	      for ( int i =str1.length() - 1; i >= 0; i-- )
	         rev = rev + str1.charAt(i);
	      if (str1.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");

	          }
	          }

}
