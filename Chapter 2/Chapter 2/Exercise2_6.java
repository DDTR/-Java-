import java.util.Scanner;

public class Exercise2_6 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int number=input.nextInt();
		if(number<0||number>1000) {
			System.out.println("Error input");
			System.exit(1);
		}
		
		int lessThanTen=number%10;
		number/=10;
		int tens=number%10;
		int hundreds=number/10;
		int sum=lessThanTen+tens+hundreds;
		
		System.out.println("The sum of digits is "+sum);
		
	}
}
