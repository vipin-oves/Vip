package handson8;

public class vehicle implements loan,insurance 
{
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public String getvNumber()
	{
		return vehicleNumber;
	}
	public void setvNumber(String vehicleNumber)
	{
		this.vehicleNumber=vehicleNumber;
	}
	
	public String getmname()
	{
		return modelName;
	}
	public void setmname(String modelName)
	{
		this.modelName=modelName;
	}
	
	public String getvtype()
	{
		return vehicleType;
	}
	public void setvtype(String vehicleType)
	{
		this.vehicleType=vehicleType;
	}
	public double getprice()
	{
		return price;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	public vehicle(String vehicleNumber, String modelName, String vehicleType, double price)
	{
		this.vehicleNumber=vehicleNumber;
		this.modelName=modelName;
		this.vehicleType=vehicleType;
		this.price=price;
	}
	 
	public double issueLoan()
	{
		if(this.vehicleType.equals("4 wheeler"))
		{
			return 0.8*this.price;
		}
		else if(this.vehicleType.equals("3 wheeler"))
			{
				return 0.75*this.price;
			}
		else if(this.vehicleType.equals("2 wheeler"))
		{
			return 0.5*this.price;
		}
		else
		{
			return -1;
		}
	}
	public double takeInsurance()
	{
		if(this.price<=150000)
		{
			return 3500;
		}
		else if(this.price<=300000 && this.price>150000)
		{
			return 4000;
		}
		else if(this.price>300000)
		{
			return 5000;
		}
		else
		{
			return -1;
		}
	}
}
