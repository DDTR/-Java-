import java.util.Scanner;

public class Exercise4_11 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a decimal value(0 to 15):");
		int i=input.nextInt();
		
		if(i>=0&&i<=9) {
			System.out.println("The hex value is "+i);
		}
		else if(i>=10&&i<=15) {
			System.out.println("The hex value is "+(char)('A'+i-10));
		}
		else {
			System.out.println(i+" is an invalid input");
		}
	}
}
