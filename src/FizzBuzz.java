import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class FizzBuzz {
	
	
	public static void testdata()
	{
		System.out.println("How many test numbers you want to enter");
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int [] test = new int[T];
		System.out.println("Enter the test case value : ");
		for(int i=0;i<test.length;i++)
		{
			test[i] = sc.nextInt();
		}
		sc.close();
//		System.out.println("Test value entered by you are : ");
//		for(int i=0;i<test.length;i++)
//		{
//			System.out.println(test[i]);
//		}
		int mul = 3*5;
		for(int i=0; i<test.length;i++)
		{
			int temp = test[i];
			for(int j=1; j<=temp;j++)
			{
				if((j%mul==0))
				{
					System.out.println("FizzBuzz");
				}
				else if(j%3==0)
				{
					System.out.println("Fizz");
				}
				else if(j%5==0)
				{
					System.out.println("Buzz");
				}
				
				else
				{
					System.out.println(j);
				}
				
			}
//			System.out.println("Next test case result :");
		
		}
	}
	
	public static void testresult()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz fb = new FizzBuzz();
		fb.testdata();

	}

}
