//SalesTax
import java.util.Scanner;

public class Example2_8 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the purchase amount: ");
		double purchaseAmount=input.nextDouble();
		double tax=purchaseAmount*0.06;
		System.out.println("Tax is $"+(int)(tax*100)/100.0);
	}

}
