import java.util.Scanner;

public class Exercise4_21 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a SSN:");
		String ssn=input.nextLine();
		
		boolean isValid=(ssn.length()==12)&&Character.isDigit(ssn.charAt(0))
				&&Character.isDigit(ssn.charAt(1))&&Character.isDigit(ssn.charAt(2))
				&&(ssn.charAt(3)=='-')&&Character.isDigit(ssn.charAt(4))
				&&Character.isDigit(ssn.charAt(5))&&Character.isDigit(ssn.charAt(6))
				&&(ssn.charAt(7)=='-')&&Character.isDigit(ssn.charAt(8))
				&&Character.isDigit(ssn.charAt(9))&&Character.isDigit(ssn.charAt(10))
				&&Character.isDigit(ssn.charAt(11));
		
		System.out.println(ssn+" is "+(isValid?"a valid":"an invalid")+" social serurity"
				+ " number");
	}
}
