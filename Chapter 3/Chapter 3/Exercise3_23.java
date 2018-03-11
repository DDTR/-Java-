import java.util.Scanner;

public class Exercise3_23{
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		
		double halfLength=10./2;
		double halfWidth=5.0/2;
		
		boolean isInTheRectangle=x<=halfLength&&x>=-halfLength&&y<=halfWidth&&y>=-halfWidth;
		System.out.println("Point ("+x+","+y+") is "+(isInTheRectangle?" ":"not")+"in the rectagle");
 	}
}
