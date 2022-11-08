package week1.day1;

public class CheckIfTheNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		
		int getNum = 5;
		
		if(getNum < 0 && getNum !=0)
			
			System.out.println("The given number " +getNum+ " is Negative");
		
		else if (getNum > 0 && getNum !=0)
			
			System.out.println("The given number " +getNum+ " is Positive");
		
		else 
			
			System.out.println("0 is either positive nor negative");
			

	}

}
