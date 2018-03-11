import java.util.Scanner;

public class Exercise3_30 {
	public static void main(String[] arg) {
		long totalMilliseconds=System.currentTimeMillis();
		long totalSeconds=totalMilliseconds/1000;
		long currentSeconds=totalSeconds%60;
		long totalMinutes=totalSeconds/60;
		long currentMinutes=totalMinutes%60;
		long totalHours=totalMinutes/60;
		long currentHours=totalHours%24;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT:");
		int timeZoneOffset=input.nextInt();
		currentHours+=timeZoneOffset;
		boolean isOverMoon=currentHours>12;
		System.out.println("Current time is "+(isOverMoon?currentHours-12:currentHours)+":"+
				currentMinutes+":"+currentSeconds+(isOverMoon?" pm":" am"));
	}
}
