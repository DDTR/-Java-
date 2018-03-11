import java.util.Scanner;

public class Exercise3_31 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate=input.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int convert=input.nextInt();
		
		switch(convert) {
		case 0:System.out.print("Enter the dollar amount: ");
			   double amountOfDollar=input.nextDouble();
			   System.out.println("$"+amountOfDollar+" is "+amountOfDollar*exchangeRate+
					   " yuan ");break;
		case 1:System.out.print("Enter the RMB amount: ");
			   double amountOfRmb=input.nextDouble();
			   System.out.println(amountOfRmb+" yuan is $"+(int)(amountOfRmb*100/exchangeRate)/100.0);
			   break;
		default:System.out.println("Incorrect input");
		}
		
	}
}
