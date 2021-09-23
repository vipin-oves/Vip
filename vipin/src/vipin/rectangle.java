package vipin;

public class rectangle extends shape {
	private double height; 
	   private double width; 
	 
	   public void setValues(double height, double width)
	   {
	      this.height = height;
	      this.width = width;
	      System.out.println("----------------------------");
	      System.out.println("RECTANGLE");
	   }

	
	   public double getHeight() 
	   {
		   System.out.println("height:"+height);
	       return 0;
	   }
	   public double getWidth() 
	   {
		   System.out.println("width:"+width);
	       return 0;
	   }  
	  public double Area()
	    {
	        double area1=height * width;
	        System.out.println("Area of rectangle:"+area1);
	        return area1;
	    }
	  public double Volume()
	    {
	        return -1;
	    }
		
	}
