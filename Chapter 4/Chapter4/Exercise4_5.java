import java.util.Scanner;

public class Exercise4_5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number of sides:");
		int num=input.nextInt();
		System.out.print("Enter the side:");
		double side=input.nextDouble();
		
		double area=num*side*side/(4*Math.tan(Math.PI/num));
		
		System.out.println("The area of the polygon is "+area);
	}
}
