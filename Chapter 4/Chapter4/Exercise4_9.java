import java.util.Scanner;

public class Exercise4_9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		String i=input.nextLine();
		char character=i.charAt(0);
		
		System.out.println("The Unicode for the character "+character+
				" is "+(int)character);
	}
}
