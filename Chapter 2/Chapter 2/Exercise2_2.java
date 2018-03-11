//ComputeAreaAndVolume
import java.util.Scanner;

public class Exercise2_2 {
	public static void main(String[] arg) {
		final double p=3.1415926;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius=input.nextDouble();
		double length=input.nextDouble();
		
		double area=(int)(radius*radius*p*10000)/10000.0;
		double volume=(int)(area*length*10)/10.0;
		
		System.out.println("The area is "+area);
		System.out.println("The volume is "+volume);
	}
}
