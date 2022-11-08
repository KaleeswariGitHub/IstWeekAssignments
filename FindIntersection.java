package week1.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] firstArray = {23,56,12,89,45};
		int[] secondArray = {5,3,23,4,9};
		int count = 0;
		System.out.println("The firt array is:");
		
		for (int i=0; i< firstArray.length; i++)
		{
			System.out.print(firstArray[i] + " ");
		}
		
		System.out.println();
       System.out.println("The second array is:");
		
		for (int j=0; j< secondArray.length; j++)
		{
			System.out.print(secondArray[j] + " ");
		}
		
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		System.out.println();
		System.out.println("The intersected numbers in the arrays are: ");
		
		//if((firstArray.length && secondArray.length) !=0)
		//{
		
		for (int k = 0; k<firstArray.length;k++)
		{
			for (int m = 0; m <secondArray.length; m++)
			{
				if (firstArray[k] == secondArray[m])
				{
					System.out.print(firstArray[k]+ " ");
				    count++;
				}
			}
			
			}
			
		if (count == 0)
			 System.out.println("Arrays doesnot have a match");
		
	}

}
