package marFinalProject;

public class Customer {

	private String name;
	private int phone;
	private String gender;
	private int periodTime; //求救設定週期QQ
	
	public Customer(String name, int phone, String gender){
		
		this.name=name;
		this.phone=phone;
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public String getGender() {
		return gender;
	}
	
	//public int period(int period) {
	//	this.periodTime=period;
	//	return periodTime;
	//}
	
}
