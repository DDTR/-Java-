import java.util.Scanner;

public class Exercise2_21 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investAmount=input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate=input.nextDouble();
		System.out.print("Enter number of years: ");
		int numberOfYears=input.nextInt();
		
		double accumulatedValue=investAmount*Math.pow(1+annualInterestRate/1200,numberOfYears*12);
	
		System.out.printf("Accumulated value is $%4.2f",accumulatedValue);
	}
}
