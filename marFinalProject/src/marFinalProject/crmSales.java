package marFinalProject;

public class crmSales {
	
	private String name;
	private int phone;
	private String gender;
	private String item;
	private int money;
	private String shoppingId;
	private String timeStamp;
	
	
	public crmSales(String customer,int phoneNumber,String buyWhat,int salesMoney, String id,String time) {
		
		Customer c=new Customer(name,phone,gender);
		name=c.getName();
		phone=c.getPhone();
		this.name=customer;
		this.phone=phoneNumber;
		this.item=buyWhat;
		this.timeStamp=time;
		this.money=salesMoney;
		this.shoppingId=id;
		
	}
	
	public String getBuyingId() {
		return shoppingId;
	}
	
	public String printContent() {
		String a = Integer.toString(phone)+"0";
		String b = Integer.toString(money);
		String title= "名字 "+"      "+" 電話          "+"                "+"  購買品項    "+"                 "+" 金額 "+"     "+" 購物編號 "+"              "+"購買時間\n";
		
		return(title+name+"   "+a+"   "+item+"   "+b+"   "+shoppingId+"   "+timeStamp);
	}
	
}
