package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String fwd="stops";
String rev="potss";

int fwdlen=fwd.length();
int revlen=rev.length();

if (fwdlen==revlen)
{
	char[] fwdArray = fwd.toCharArray();
	char[] revArray = rev.toCharArray();
	
	Arrays.sort(fwdArray);
	Arrays.sort(revArray);
	
boolean anag = Arrays.equals(fwdArray, revArray);

if(anag)
{
	System.out.println("The strings are anagrams");
}
else
{
	System.out.println("The strings are not anagrams");
}
	
//	for(char fwdchar:fwdArray)
//	{
//		System.out.println(fwdchar);
//	}
//	System.out.println("*****************************");
//	
//	for(char revchar:revArray)
//	{
//		System.out.println(revchar);
//	}
//	//fwd=fwdArray.toString();
//	//rev=revArray.toString();
//	
//	System.out.println(fwd);
//	System.out.println(rev);
//	
//	//fwd.equalsIgnoreCase(rev);
	
	}
else
{
	System.out.println("The strings are not anagrams");
}
}
}
