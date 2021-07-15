package week1.day1;

public class assignmentArmstrong {
	public static void main(String[] args) {
		//to check whether 153 is an armstrong number
		int number=153;
		System.out.println("To check whether 153 is an Armstrong Number: ");
		int num=153;
		int sum=0;
		
		while (num>0)
		{
			int remainder=num%10;
			int quotient=num/10;
			num=quotient;
			sum=sum+(remainder*remainder*remainder);
		System.out.println("sum of number: "+ sum);
		}
		if (sum==number)
		{
			System.out.println(number +" is an Armstrong number.");
		
		}
	}

}
