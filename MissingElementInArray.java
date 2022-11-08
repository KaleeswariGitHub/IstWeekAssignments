package week1.day2;

public class MissingElementInArray {

	public static void main(String[] args) {
	
		int[] listOfNumbers = {1,2,3,4,6,7,8};
		System.out.println("The given numbers are: ");
		
	for (int i=0; i< listOfNumbers.length; i++)
		{
            
	        System.out.print(listOfNumbers[i] + " ");
		}
	
	System.out.println();
	int j=1;
	for (int k=0; k< listOfNumbers.length;k++)
	{
	     if (j != listOfNumbers[k])
	      {
	    	 System.out.println("The missing number is: " +j);
	    	 break;
	      }
	     j++;

	    
		
	}
	
	}

}
