import java.util.Scanner;

public class Exercise3_14 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		int coin=(int)(Math.random()+0.5);
		
		System.out.print("Enter your guess number,0-negitive,1-positive: ");
		int guess=input.nextInt();
		
		System.out.println("The correct is "+coin);
		System.out.println("You are "+(guess==coin?"correct!":"wrong!"));
	}
}
