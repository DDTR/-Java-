import java.util.Scanner;

public class Exercise3_5 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int today=input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int numberOfDays=input.nextInt();
		int futureDay=(today+numberOfDays)%7;
		
		System.out.print("Today is ");
		switch(today) {
		case 1:System.out.print("Monday ");break;
		case 2:System.out.print("Tueeday ");break;
		case 3:System.out.print("Wednesday ");break;
		case 4:System.out.print("Thursday ");break;
		case 5:System.out.print("Friday ");break;
		case 6:System.out.print("Saturday ");break;
		case 0:System.out.print("Sunday ");break;
		}
		
		System.out.print("and the future day is ");
		switch(futureDay) {
		case 1:System.out.print("Monday ");break;
		case 2:System.out.print("Tueeday ");break;
		case 3:System.out.print("Wednesday ");break;
		case 4:System.out.print("Thursday ");break;
		case 5:System.out.print("Friday ");break;
		case 6:System.out.print("Saturday ");break;
		case 0:System.out.print("Sunday ");break;
		}
	}
}
