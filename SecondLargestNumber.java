package week1.day1;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int[] givenArrays = {34,78,12,22,98,32,65,49};
		
		System.out.println("User entered array is: ");
		
		/*for(int num:givenArrays)
			
		{
			System.out.print(num + " ");
		}
		*/
		
		for(int i =0; i< givenArrays.length; i++)
			
		{
			System.out.print(givenArrays[i] + " ");
		}
			
		Arrays.sort(givenArrays);
		System.out.println();
		System.out.println("Sorted array is: ");
		
         /*for(int num:givenArrays)
			
		{
			System.out.print(num + " ");
		}
		*/
		
		for (int j= 0; j< givenArrays.length; j++)
		{
			System.out.print(givenArrays[j] + " ");
		}
		
		System.out.println();
		int secNum = givenArrays.length - 2;
		int secLarArray = givenArrays[secNum];
		
		System.out.println("Second largest number in the Array is: " + secLarArray);
		
		
		
		
	}

}
