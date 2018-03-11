import java.util.Scanner;

public class Exercise3_33 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter weight and price for package 1: ");
		double weight1=input.nextDouble();
		double price1=input.nextDouble();
		System.out.print("Enter weight and price for package 2: ");
		double weight2=input.nextDouble();
		double price2=input.nextDouble();
		
		double totalPrice1=1/weight1*price1;
		double totalPrice2=1/weight2*price2;
		
		if(totalPrice1<totalPrice2)
			System.out.println("Package 1 has a better price.");
		else if(totalPrice1==totalPrice2)
			System.out.println("Two packages hae the same price.");
		else
			System.out.println("Package 2 has a better price.");
			
	}
}
