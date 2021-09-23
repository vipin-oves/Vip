
public class pattern7 {

	public static void main(String[] args) { 
		 for (int i=1; i<=9; i++)
	        {
	    
	            for (int j=9; j>i; j--)
	            {
	                System.out.print(" ");
	            }
	            
	            for (int k=1; k<=(i * 2) -1; k++)
	            {
	                if( k == 1|| k == (i * 2) -1)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
		for(int i = 5; i >= 1; --i) {
		      for(int k1 = 1; k1 <= 5 - i; ++k1) {
		        System.out.print("  ");
		      }

		      for(int j=i; j <= 2 * i - 1; ++j) {
		        System.out.print("* ");
		      }

		      for(int j = 0; j < i - 1; ++j) {
		        System.out.print("* ");
		      }

		      System.out.println();
		    }    
		int k1=0;
		 for (int i = 1; i <= 5; ++i, k1 = 0) {
		      for (int j = 1; j <= 5 - i; ++j) {
		        System.out.print("  ");
		      }

		      while (k1 != 2 * i - 1) {
		        System.out.print("* ");
		        ++k1;
		      }

		      System.out.println();
		    }
		  }
	


}
