package week1.day1;

public class ConvertNegativeNumberToPositive {

	public static void main(String[] args) {
		
		
		int getNum  = -6;
		
		if (getNum < 0)
		{
			getNum = -1* getNum;
			System.out.println("The converted Positive Number is " +getNum);
		}
		
		else
			System.out.println("The number "+getNum+" is already positive");

	}

}
