package Unique;



public class uniquen 
{
	private String sentence;
	public void ReadInput(String str )
	{
		this.sentence=str;
	}
	public int str(char str[], int length)
	   {
	       for(int i = 0; i < length; i++)
	       {
	           if((str[i] >= 0 && str[i] <= 31) || (str[i] >= 33 && str[i] <= 64) || (str[i] >= 91 && str[i] <= 96) || (str[i] >= 123 && str[i] <= 127))
	           {
	               return 1;
	           }
	       }
	       return 0;
	   }
	public void PrintOutput()
	{
		System.out.println("Your sentence was :"+sentence);
		 char str[] = sentence.toCharArray();
	       int flag = 0;
	       if(str(str, str.length) == 1)
	       {
	           System.out.println("Invalid Sentence");
	       }
	      else
	       {
	        for(int i = 0; i < str.length; i++)
	         {
	          int count = 0;
	          for(int j = 0; j < str.length; j++)
	           {
	            if(str[i] == str[j])
	              {
	               count++;
	                if(count > 1)
	                {  
	                break;
	         }
	      }
	  }
	            if(count == 1)
	            {
	             flag = 1;
	             System.out.println(str[i]);
	             }
	           }
	           if(flag == 0)
	           {
	               System.out.println("No unique characters");
	           }
	       }
	}
}
