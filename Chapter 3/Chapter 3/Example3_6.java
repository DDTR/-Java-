//TestBooleanOpeator
import java.util.Scanner;

public class Example3_6 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		//Receive an input
		System.out.print("Enter an integer: ");
		int number=input.nextInt();
		
		if(number%2==0&&number%3==0)
			System.out.println(number+" is divisiable by 2 and 3.");
		if(number%2==0||number%3==0)
			System.out.println(number+" is divisiable by 2 or 3.");
		if(number%2==0^number%3==0)
			System.out.println(number+" is divisiable by 2 or 3, but not both.");
		
		
	}
}
