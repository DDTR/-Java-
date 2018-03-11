//SimpleIfDemo
import java.util.Scanner;

public class Example3_2 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a integer: ");
		int integer=input.nextInt();
		
		if(integer%5==0)
			System.out.println("HiFive");
		if(integer%2==0)
			System.out.println("HiEven");
	}
}
