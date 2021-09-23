package vipin;

public class cube extends shape
{
	private double height; 
	   private double width; 
	   private double length;
	   
	   public void setValues(double height, double width, double length)
	   {
	      this.height = height;
	      this.width = width;
	      this.length = length;
	      System.out.println("----------------------------");
	      System.out.println("CUBE");
	   }

	
	   public double getHeight() 
	   {
		   System.out.println("Height:"+height);
	       return height;
	   }
	   public double getwidth() 
	   {
		   System.out.println("width:"+width);
	       return width;
	   }  
	   public double getlength() 
	   {
		   System.out.println("length:"+length);
	       return length;
	   }  
	  public double Area()
	    {
		  double area1=(2*length*width)+(2*width*height)+(2*height*length);
	        System.out.println("Area of cube:"+area1);
	        return area1;
	    }
	  public double Volume()
	    {
		  double volume1=(length*width*height);
	        System.out.println("Volume of Cube:"+volume1);
	        return volume1;
	    }

}
