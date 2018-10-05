package parkingService;

public class CarDetails {
	
	private String name;
	
	private int phoneNo;
	public CarDetails(String name,  int phoneNo) {
		super();
		this.name = name;
		
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "CarDetails [name=" + name + ", phoneNo=" + phoneNo + "]";
	}
	
	
	

}
