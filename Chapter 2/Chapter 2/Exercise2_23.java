import java.util.Scanner;

public class Exercise2_23 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		double distance=input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon=input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon=input.nextDouble();
		
		System.out.printf("The cost of driving is $%3.2f", distance/milesPerGallon*pricePerGallon);
		
	}
}
