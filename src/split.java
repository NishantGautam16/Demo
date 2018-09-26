
public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date = "5:30";
		String[] day = date.split(":");
		for(int i=0; i< day.length;i++)
		{
			System.out.println(day[i]);
		}

	}

}
