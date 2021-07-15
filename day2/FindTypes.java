package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$";
		int letterCount = 0, spaceCount = 0, numCount = 0, splCharCount = 0;

		char[] testArr = test.toCharArray();

		for (int i = 0; i < testArr.length; i++) {
			
			if (Character.isLetter(testArr[i])) 
			{
				letterCount++;
			}
			else if (Character.isDigit(testArr[i])) 
			{
				numCount++;
			} 
			else if (Character.isSpaceChar(testArr[i])) 
			{
				spaceCount++;
			} 
			else {
				splCharCount++;
			}

		}
		System.out.println("letter: " + letterCount);
		System.out.println("space: " + spaceCount);
		System.out.println("number: " + numCount);
		System.out.println("specialCharcter: " + splCharCount);
	}
}
