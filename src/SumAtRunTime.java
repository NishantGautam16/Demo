import java.util.Scanner;

public class SumAtRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		Scanner sc = new Scanner(System.in);
		char ch = 'Y';
		while(ch=='Y'){
			System.out.println("If you want to add number press Y else enter other text");
			char ip = sc.next().charAt(0);
			if(ip=='Y')
			{
				System.out.println("Enter your number :");
				int n2 = sc.nextInt();
				sum = sum + n2;
			}
			else
			{
				break;
			}
			ch = ip;
			
		}
		System.out.println("Sum of number entered by you is : "+sum);

	}

}
