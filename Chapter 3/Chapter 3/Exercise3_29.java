import java.util.Scanner;

public class Exercise3_29 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter circle1's center x-,y-coordinate,and radius: ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double radius1=input.nextDouble();
		
		System.out.print("Enter circle2's center x-,y-coordinate,and radius: ");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double radius2=input.nextDouble();
		
		double centerDistance=Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5);
		
		if(centerDistance<=Math.abs(radius1-radius2))
			System.out.println("Circle2 is inside circle1");
		else if(centerDistance<=radius1+radius2)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlap circle1");
	}
}