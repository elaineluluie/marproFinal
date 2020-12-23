package marFinalProject;

import java.util.*;
import java.text.*;

public class crmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String name=sc.next();
			int phone=sc.nextInt();
			String item=sc.next();
			int money=sc.nextInt();
			String shoppingId=sc.next();
			String timeStamp=sc.next();
			
			SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date current = new Date();
			timeStamp=sdFormat.format(current);
			
			crmSales sales=new crmSales(name,phone,item,money,shoppingId,timeStamp);
			System.out.println(sales.printContent());
		}
		
	}

}
