//ComputeAreaWithConstant

import java.util.Scanner;

public class Example2_4 {
	public static void main(String[] arg) {
		final double PI=3.14159;//Define a constant
		
		//Create a Scanner object
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number fo radius: ");
		double radius=input.nextDouble();
		double area=radius*radius*PI;
		
		System.out.println("The area for the circle of radius "+
				radius+" is "+area);
	}
}
