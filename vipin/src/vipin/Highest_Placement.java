package vipin;

import java.util.Scanner;

public class Highest_Placement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
            int Cse= s.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
            int Ece=s.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
            int Mech=s.nextInt();
            
        if(Cse<0||Ece<0||Mech<0)
        {
            System.out.println("Input is Invalid");
        }
        
        else if(Cse==Ece && Ece==Mech)
        {
            System.out.println("None of the department has got the highest placement");
        }
        
        else if(Cse==Ece && Mech<Cse)
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("ECE");
        }
        
        else if(Cse==Mech && Ece<Mech)
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("MECH");
        }
        
        else if(Ece==Mech && Cse<Mech)
        {
            System.out.println("Highest placement");
            System.out.println("ECE");
            System.out.println("MECH");
        }
        
        else if(Cse>Ece && Cse>Mech)
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
        }
        
        else if(Ece>Cse && Ece>Mech)
        {
            System.out.println("Highest placement");
            System.out.println("ECE");
        }
        
        else if(Mech>Cse&&Mech>Ece)
        {
            System.out.println("Highest placement");
            System.out.println("MECH");
        }

	}

}
