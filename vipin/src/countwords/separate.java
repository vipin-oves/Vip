package countwords;

import java.util.Scanner;

public class separate {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        System.out.println("Enter Student's Article");
        String line=s.nextLine();
        line=line.toLowerCase();
        String[] st=line.split("[,;:.?! ]");
        int l=st.length;
        for(int k=0;k<l;k++)
        {
        	 System.out.println(st);
        }
       /* int count=0;
        for(int i=0;i<l;i++)
        {
        	for(int j=0;j<i;j++)
        	{
        		if(st[i]==st[j])
        		{
        			count++;
        			j++;
        		}
        		else
        		{
        			i++;
        		}
        	}
        	 System.out.println(st[i]+":"+count);
        }*/
       
	}

}
