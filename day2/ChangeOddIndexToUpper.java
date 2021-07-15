package week1.day2;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sample = "changeme";
		StringBuffer updatedStr=new StringBuffer();
		char[] changed = sample.toCharArray();
		System.out.println(changed);

		for (int i = 0; i < changed.length; i++) {

			char c = changed[i];
			
			if (i % 2 == 0) 
			{
				updatedStr.append(c);
			} 
			else 
			{
				c = Character.toUpperCase(c);
				updatedStr.append(c);
			}
		}
		System.out.println(updatedStr.toString());

	}

}
