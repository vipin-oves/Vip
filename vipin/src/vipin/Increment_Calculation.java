package vipin;

import java.util.Scanner;

public class Increment_Calculation {

	public static void main(String[] args) {
		int salary;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the salary");
        salary = s.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        double appraisal = s.nextDouble();

        if((appraisal>0 && appraisal<=5)&&salary>0)
        {
            if(appraisal>=1 && appraisal<=3)
            {
                salary = salary+((salary*10)/100);
            }
            else if(appraisal>=3.1 && appraisal<=4)
            {
                salary = salary+((salary*25)/100);
            }
            else if(appraisal>=4.1 && appraisal<=5)
            {
                salary = salary +((salary*30)/100);
            }
            System.out.println(salary);
        }
        else
        {
            System.out.println("Invalid Input");
        }

	}

}
