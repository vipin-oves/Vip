package vipin;

import java.util.Scanner;

public class Least_offer {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Number of inputs");
        int no_of_input=s.nextInt();
        s.nextLine();
        String input[]=new String[no_of_input];
        String input1[][]=new String[no_of_input][3];
        
        for(int i=0;i<no_of_input;i++)
        {
            input[i]=s.nextLine();
            input1[i]=input[i].split(",");
        }
        
        int disc[]=new int[no_of_input];
        
        for(int i=0;i<no_of_input;i++)
        {
            disc[i]=(Integer.parseInt(input1[i][2])*Integer.parseInt(input1[i][1]))/100;
        }
        
        int min_dis=32767;
        String output=new String();
        
        for(int i=0;i<input.length;i++)
        {
            if(min_dis>disc[i])
            {
                min_dis=disc[i];
            }
        }
        
        for(int i=0;i<input.length;i++)
        {
            if(disc[i]==min_dis)
            {
                output=output+input1[i][0]+" ";
            }
        }
        System.out.println("\nItem with least offer is: ");
        System.out.println(output);

	}

}
