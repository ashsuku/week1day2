package week1.day1;

public class assignmentFibonacci {
	
	public static void main(String[] args) {
		
		
		int firstNo=0;
		int secondNo=1;
		int range=8;
		System.out.println("Fibonacci Series :");
		System.out.print(firstNo+" , "+secondNo);
		//System.out.println(secondNo);
		//System.out.println(firstNo,secondNo);
		for (int i = 0; i < range-2; i++) {
			int thirdNo=firstNo + secondNo;
			firstNo=secondNo;
			secondNo=thirdNo;
			System.out.print(" , "+secondNo);
		}
	}

}
