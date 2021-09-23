
public class Cube implements shapes {
	private static  double height; 
	   private static  double width; 
	   private static  double length;
	   
	   public void setValues(double height, double width, double length)
	   {
	      Cube.height = height;
	      Cube.width = width;
	      Cube.length = length;
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
		  double Area=(2*length*width)+(2*width*height)+(2*height*length);
	        System.out.println("Area of cube:"+Area);
	        return Area;
	    }
	  public double Volume()
	    {
		  double Volume=(length*width*height);
	        System.out.println("Volume of Cube:"+Volume);
	        return Volume;
	    }

}
