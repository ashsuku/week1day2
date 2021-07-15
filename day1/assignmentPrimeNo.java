package week1.day1;

public class assignmentPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13;
		boolean flag=false;
		for (int i = 2; i < num/2; i++) {
			
			if (num%i==0) {
				//System.out.println("Not a Prime Number");
				flag=true;
				break;
			}
			/*else {
				System.out.println("Is a Prime Number");
			}*/
		}
		if (flag==false)
		{
			System.out.println("Is a Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}

	}

}
