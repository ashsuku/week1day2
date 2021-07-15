package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numArr= {1,2,3,4,7,6,8};
		int j=1;
		Arrays.sort(numArr);
		//System.out.println(numArr[4]);
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		//alternate
		//for(int i=0;i<numArr.length;i++)
		//{
		//if (i!=numArr[i-1])
		//	{System.out.println();
		//break;
		//	}
		//}
		
		for (int i = 0; i < numArr.length; i++) {

			if (j == numArr[i]) {
				j++;
			} 
			else {
				System.out.println("The missing element in the array is: " + j);
				break;
			}
		}

	}
}
