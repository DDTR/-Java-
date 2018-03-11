//LeapYear
import java.util.Scanner;

public class Example3_7 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year=input.nextInt();
		
		boolean isLeapYear=(year%4==0&&year%100!=0)||year%400==0;
		
		System.out.println(year+" ia a leap year? "+isLeapYear);
	}
}
