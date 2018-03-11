import java.util.Scanner;

public class Exercise4_18 {
	public static void main(String arg[]) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter two characters:");
		String i=input.nextLine();
		
		char major=Character.toUpperCase(i.charAt(0));
		char grade=i.charAt(1);
		
		switch(major) {
		case 'M':System.out.print("Mathematics ");break;
		case 'C':System.out.print("Computer Science ");break;
		case 'I':System.out.print("Information Technology ");break;
		default:System.out.println("Invalid input");System.exit(1);
		}
		
		switch(grade) {
		case '1':System.out.println("Freshman");break;
		case '2':System.out.println("Sophpmore");break;
		case '3':System.out.println("Junior");break;
		case '4':System.out.println("Senior");break;
		default:System.out.println("Invalid input");System.exit(1);
		}
		
	}
}
