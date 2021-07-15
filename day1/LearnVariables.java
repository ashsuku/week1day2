package week1.day1;

public class LearnVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Theme Mobile phones
		//variables re properties of objects
/*
 * 
 */
		//-128 to +128
		byte countryCode=91;
		byte screenSize=14;
		//int mobileNo=99406511973; out of range error
		
		int regNum=826187;
		short price=25000;
		long mobileNo=99364377999l;
		
		float current=22.5f;
		double mobPrice=46999.99;
		char brand='A';
		
		boolean isSmartPhone=true;
		
		//Non Primitive datatypes
		//String
		String mobileName="Samsung galaxy s8";
		
		System.out.println("Country code: "+ countryCode);
		System.out.println("Registration Number: " + regNum);
		System.out.println("Price short: "+ price);
		System.out.println("Mobile Number: "+ mobileNo);
		System.out.println("Current: "+current);
		System.out.println("Mobile Price double: "+ mobPrice);
		System.out.println("Brand: "+ brand);
		System.out.println("Is it a SmartPhone: "+ isSmartPhone);
		System.out.println("Mobile Name: "+ mobileName);
		
		
	}

}
