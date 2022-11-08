package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		
		int iteration = 10;
		int n1=0,n2=1,sum=0;
		int count =3;
		
		System.out.println("The first " + iteration +" numbers in the Fibonacci series are:");
		System.out.println(n1);
		System.out.println(n2);
		
		
		while (count<=iteration)
		{
		sum = n1 + n2;
		System.out.println(sum);
		count++;
		n1= n2;
		n2 = sum ;
			   
		} 
		
		
		
		
	}

}
