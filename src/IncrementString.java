import java.util.Scanner;

public class IncrementString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any String");
		Scanner sc = new Scanner(System.in);
		String userString = sc.nextLine();
		sc.close();
		System.out.println("String emtered by user is : "+ userString);
		String finalString = new String();
		for(int i =0;i<userString.length();i++)
		{
			if((userString.charAt(i)==' '))
					{
				finalString = finalString + " ";
					}
			else 
			{
			finalString = finalString + (char)(userString.charAt(i)+3);
			}
		}
		System.out.println("string after increament is : "+finalString);
	}

}
