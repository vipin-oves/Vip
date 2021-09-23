
public class Rectangle implements shapes{
	private static double height; 
	   private static double width; 
	 
	   public void setValues(double height, double width)
	   {
	      Rectangle.height = height;
	      Rectangle.width = width;
	      System.out.println("----------------------------");
	      System.out.println("RECTANGLE");
	   }

	
	   public double getHeight() 
	   {
		   System.out.println("height:"+height);
	       return height;
	   }
	   public double getWidth() 
	   {
		   System.out.println("width:"+width);
	       return width;
	   }  
	  public double Area()
	    {
	        double Area=height * width;
	        System.out.println("Area of rectangle:"+Area);
	        return Area;
	    }
	  public double Volume()
	    {
	        return -1;
	    }
		
	}
