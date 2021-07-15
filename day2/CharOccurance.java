package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="welcome to chennai";
		int count=0;
		char[] charArr=str.toCharArray();
		int length=charArr.length;
		System.out.println(length);
		
		for (int i = 0; i < charArr.length-1; i++) {
			if(charArr[i]=='e')
			{
				count++;
				
			}
			/*else
				
			{
				//System.out.println("The count of the letter is : " + count);
			}*/
		}
		System.out.println("The count of the letter e is : " + count);
	}

}
