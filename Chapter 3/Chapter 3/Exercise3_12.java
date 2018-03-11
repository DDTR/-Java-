import java.util.Scanner;

class Exercise3_12 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int integer=input.nextInt();
		
		int x1=integer%10;
		int x3=integer/100;
		
		if(x1==x3)
			System.out.println(integer+" is a palindrome");
		else
			System.out.println(integer+" is not a palindrome");
		
	}
}
