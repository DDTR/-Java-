import java.util.Scanner;
 
public class Exercise4_14 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a letter grade:");
		String i=input.nextLine();
		char letter=i.charAt(0);
		
		switch(letter) {
		case 'A':System.out.println("The numeric value for grade "+letter+" is 4");break;
		case 'B':System.out.println("The numeric value for grade "+letter+" is 3");break;
		case 'C':System.out.println("The numeric value for grade "+letter+" is 2");break;
		case 'D':System.out.println("The numeric value for grade "+letter+" is 1");break;
		case 'F':System.out.println("The numeric value for grade "+letter+" is 0");break;
		default: System.out.println(letter+" is a invalid input");
		}
	}
}
