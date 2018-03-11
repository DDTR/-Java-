import java.util.Scanner;

public class Exercise2_16 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		double side=input.nextDouble();
		double area=3*Math.pow(3, 0.5)*side*side/2;
		
		System.out.printf("The area of hexagon is %4.4f",area);
		
	}
}
