package Inclass;

public class inc {
	 private long phoneNumber;
	 private Address tempAddress;
	 private Address permAddress;
	 
	 class Address
	 {
		 private String name;
		 private String street;
		 private String city;
		 private String state;
	 
		public String getname() 
			{
				return name;
			}
		public void setname(String name) 
			{
				this.name = name;
			}
		public String getstreet() 
			{
				return street;
			}
		public void setstreet(String street) 
			{
				this.street = street;
			}
		public String getcity() 
			{
				return city;
			}
		public void setcity(String city) 
			{
				this.city = city;
			}
		public String getstate() 
			{
				return state;
			}
		public void setstate(String state) 
			{
				this.state = state;
			}
	 }
	 public long getphoneNumber() 
	 	{
			return phoneNumber;
		}
	public void setphoneNumber(int pno) 
		{
			this.phoneNumber = pno;
		}
	public Address gettempAddress() 
		{
			return tempAddress;
		}
	public void settempAddress(Address tad) 
		{
			this.tempAddress = tad;
		}
	public Address getpermAddress() 
		{
			return permAddress;
		}
	public void setpermAddres(Address permad) 
		{
			this.permAddress = permad;
		} 
	
	 
}
