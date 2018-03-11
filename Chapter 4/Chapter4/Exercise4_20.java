import java.util.Scanner;

public class Exercise4_20 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a String:");
		String str=input.nextLine();
		
		System.out.println("The length is "+str.length()+" and the first"
				+ "letter is "+str.charAt(0));
	}
}
