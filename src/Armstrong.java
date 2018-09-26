import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, power=0,num;
		System.out.println("Enter number you want to check as Armstrong : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		num=num1;
		sc.close();
		while(num>0)
		{
			power = num%10;
			sum = sum+(power*power*power);
			num = num/10;
		}
		System.out.println(sum);
		if(sum==num1)
		{
			System.out.println("Entered number is Armstrong number");
		}
		else
		{
			System.out.println("Entered number is not Armstrong Number");
		}

	}

}
