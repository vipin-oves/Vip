package vipin;

public class Hosteler extends Stud {
	  private String hName;
	    private int rNumber;
	    public Hosteler()
	    {
	        hName=" ";
	        rNumber=0;
	    }
	    public void setHostelName(String h)
	    {
	        hName=h;
	    }
	    public void setRoomNumber(int r)
	    {
	        rNumber=r;
	    }
	    public String getHostelName()
	    {
	        return hName;
	    }
	    public int getRoomNumber()
	    {
	        return rNumber;
	    }
}
