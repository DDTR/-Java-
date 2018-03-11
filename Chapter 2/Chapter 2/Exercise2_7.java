import java.util.Scanner;

public class Exercise2_7 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		int minutes=input.nextInt();
		
		int totalDays=minutes/(60*24);
		int days=totalDays%365;
		int years=totalDays/365;
		
		System.out.println(minutes+" minutes is approximately "+
				years+" years and "+days+" days.");
	}
}
