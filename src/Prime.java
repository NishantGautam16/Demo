import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want to check for prime");
//		int num = sc.nextInt();
		int Sum = 0;
		
		for(int i= 1; i<=100; i++)
		{
			int Count = 0;
			for(int j=1; j<= i;j++)
			{
				if(i%j==0)
				{
					Count++;
				}
				
			}
			if(Count<=2)
			{
				System.out.println("Prime number is : "+ i);
				Sum = Sum+i;
			}
		}
		System.out.println("Sum of prime number is : "+ Sum);
		
		
		
//		for(int i= 1; i<=num/2;i++)
//		{
//			if(num%i==0)
//			{
//				Count++;
//			}
//			
//		}
//		if(Count<=2)
//		{
//			System.out.println("Number is prime");
//		}
//		else
//		{
//			System.out.println("number is not prime");
//		}

	}

}
