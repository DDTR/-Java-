import java.util.Scanner;

public class Exercise2_8 {
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
		System.out.println("Current time is "+currentHours+":"+
				currentMinutes+":"+currentSeconds);
	}
}
