import java.util.Scanner;

public class Exercise4_1 {
	public static void main(String[] args) {
		double pi=Math.PI;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the length from thr center to a vertex:");
		double r=input.nextDouble();
		double s=2*r*Math.sin(pi/5);
		double area=5*s*s/(4*Math.tan(pi/5));
		
		System.out.printf("The area of the pentagon is %4.2f",area);
	}
}
