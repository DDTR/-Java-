import java.util.Scanner;

public class Exercise3_21 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter year: (e.g.,2012): ");
		int year=input.nextInt();
		System.out.print("Enter month:1-12: ");
		int month=input.nextInt();
		System.out.print("Enter the day of the month:1-31: ");
		int day=input.nextInt();
		
		if(year>0&&month>=1&&month<=12&&day>=1&&day<=31) {
			if(month==1||month==2) {
				month+=12;
				year-=1;
			}
			int j=year/100;
			int k=year%100;
				
			int h=(day+26*(month+1)/10+k+k/4+j/4+5*j)%7;
			
			System.out.print("Day of the week is ");
			switch(h){
				case 0:System.out.println("Saturday");break;
				case 1:System.out.println("Sunday");break;
				case 2:System.out.println("Monday");break;
				case 3:System.out.println("Thusday");break;
				case 4:System.out.println("Wensday");break;
				case 5:System.out.println("Thursday");break;
				case 6:System.out.println("Friday");break;
			}
			
		}
		else
			System.out.println("Invalid input");
	}
}
