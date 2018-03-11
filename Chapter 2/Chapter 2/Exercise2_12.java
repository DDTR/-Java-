import java.util.Scanner;

public class Exercise2_12 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter speed and acceleration: ");
		double speed=input.nextDouble();
		double acceleration=input.nextDouble();
		double miniLength=speed*speed/(2*acceleration);
		
		System.out.printf("The minium runway length for this airplane is %5.3f",
				miniLength);
	}
}
