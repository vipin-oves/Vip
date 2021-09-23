package Membermani;

public class member implements Comparable<member> {
	private int memid;
	private String memberName;
	private String address;
	
	public int getmemid() {
		return memid;
	}
	
	public void setmemid(int memid) {
		this.memid = memid;
	}
	
	public String getmemberName() {
		return memberName;
	}
	
	public void setmemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getaddress() {
		return address;
	}
	
	public void setaddress(String address) {
		this.address = address;
	}

	
	public int compareTo(member m) {
		int comparememId=((member)m).getmemid();
        return this.memid-comparememId;
	}

}
