package vipin;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Fuel_Consumption_Calculator {

	private static DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) 
	{
	      Scanner s= new Scanner (System.in);
	      System.out.println("Enter the no of liters to fill the tank");
	      int lit =s.nextInt();

	      double lite= (lit*1.00);

	      if(lit<1)
	      {
	          System.out.println(lit+" is an Invalid Input");
	          System.exit(0);
	      }
	      System.out.println("Enter the distance covered");
	      int dist =s.nextInt();
	      double dis= (dist*1.00);
	      if(dist<1)
	      {
	          System.out.println(dist+" is an Invalid Input");
	          System.exit(0);
	      }
	      double h = ((lite/dis)*100);
	      System.out.println("Liters/100KM");
	      System.out.println(df.format(h));
	      double mil = (dis*0.6214);
	      double gal =(lite*0.2642);
	      double mpg = mil/gal;
	      System.out.println("Miles/gallons");
	      System.out.println(df.format(mpg));

	}

}
