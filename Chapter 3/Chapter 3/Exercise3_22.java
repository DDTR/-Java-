import java.util.Scanner;

public class Exercise3_22 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a point with two coordiante: ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		
		System.out.print("Point ("+x+","+y+") is");
		if(Math.pow(x*x+y*y, 0.5)<=10) 
			System.out.println(" in the circle");
		else
			System.out.println(" not in the circle");
	}
}
