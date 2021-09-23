public class Triangle implements shapes {
	private static double height; 
	   private static double base; 
	 
	   public void setValues(double height, double base)
	   {
	      Triangle.height = height;
	      Triangle.base = base;
	      System.out.println("----------------------------");
	      System.out.println("TRIANGLE");
	   }

	
	   public double getHeight() 
	   {
		   System.out.println("Height:"+height);
	       return height;
	   }
	   public double getBase() 
	   {
		   System.out.println("Base:"+base);
	       return base;
	   }  
	  public double Area()
	    {
		  double area1=(height * base)/2;
	        System.out.println("Area of triangle:"+area1);
	        return area1;
	    }
	  public double Volume()
	    {
	        return -1;
	    }

}
