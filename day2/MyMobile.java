package week1.day2;

public class MyMobile {
	
	//instance variables
	int screenSize=12;
	int cost=40000;
	char logo='S';
	float amp=1.5f;
	long mobNumber=993251465;
	boolean isTouch=true;
	String brand="Galaxy";
	String sms;
	
	public void makecalls() {
		System.out.println("Make calls from my mobile");
	}

	public void sendMsg(String sms) {
		System.out.println("Message is sent successfully");
		System.out.println(sms);
	}

	private void payBills() {
		System.out.println("Bill pay successful");
	}
	public void setAlarm(double time) {
		System.out.println("Alarm set to time: "+ time);
		
	}
	//Return variables
	public int getCost()
	{
		System.out.println(cost);
		return cost;
	}
	
	public boolean isTouch()
	{
		System.out.println("Is it a touch phone? ");
        return isTouch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int check = 111;
		MyMobile obj=new MyMobile();
		obj.makecalls();
		obj.sendMsg("You have used 50% of your data");
		obj.payBills();
		obj.setAlarm(1.30);
		int price=obj.getCost();
		System.out.println(price +"is the price of the mobile");
		boolean touch=obj.isTouch();
		System.out.println("Is it a touch phone? "+ touch);
		//obj.sendMsg();
		
		//System.out.println(mobNumber);
		
	}

}
