package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String givn="malayalam";
		String rev="";
		
		//char[] charArr=givn.toCharArray();
		
		for (int i = givn.length()-1; i >= 0; i--) {
		//rev=charArr[i];
			rev=rev+givn.charAt(i);
		}
		if (rev.equals(givn)) {
			System.out.println("The given string is a palindrome");
			
		}
		else
		{
			System.out.println("The string is not a palindrome");
		}
	}

}
