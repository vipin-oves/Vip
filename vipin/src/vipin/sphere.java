package vipin;

public class sphere extends shape
{
	private double radius;  
	 
	   public void setValues(double radius)
	   {
	      this.radius = radius;
	      System.out.println("----------------------------");
	      System.out.println("SPHERE");
	   }

	
	   public double getradius() 
	   {
		   System.out.println("radius:"+radius);
	       return radius;
	   }
	   
	   public double Area()
	   {	
		   double area1=(4*Math.PI*radius*radius);
	        System.out.println("Area of sphere :"+area1);
	        return area1;
	    }
	  public double Volume()
	    {
		  double volume1=((4*Math.PI*radius*radius*radius)/3);
	        System.out.println("Volume of sphere:"+volume1);
		  return volume1;
	    }


}
