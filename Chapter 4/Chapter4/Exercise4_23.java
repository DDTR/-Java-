import java.util.Scanner;

public class Exercise4_23 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter employee's name:");
		String name=input.nextLine();
		System.out.print("Enter number of hours worked in a week:");
		double numOfHours=input.nextDouble();
		System.out.print("Enter houtly pay rate:");
		double payRate=input.nextDouble();
		System.out.print("Enter federal tax withholding rate:");
		double federalTaxRate=input.nextDouble();
		System.out.print("Enter state tax withholding rate:");
		double stateTaxRate=input.nextDouble();
		
		double grossPay=numOfHours*payRate;
		double federalDuction=numOfHours*payRate*federalTaxRate;
		double stateDuction=numOfHours*payRate*stateTaxRate;
		double totalDecution=federalDuction+stateDuction;
		
		System.out.println("Employee Name: "+name);
		System.out.printf("Hours Worked: %2.1f\n",numOfHours);
		System.out.printf("Pay Rate: $ %2.2f\n", payRate);
		System.out.printf("Gross Pay: $ %2.1f\n", grossPay);
		System.out.println("Deductions:");
		System.out.printf("    Federal Withholding(%2.1f", federalTaxRate*100);
		System.out.printf("%%): $%2.1f\n", federalDuction);
		System.out.printf("    State Withholding(%2.1f", stateTaxRate*100);
		System.out.printf("%%): $%2.2f\n",stateDuction);
		System.out.printf("    Total Decuction: $%2.2f\n",totalDecution);
		System.out.printf("Net Pay: $%2.2f\n",grossPay-federalDuction-stateDuction);
	}
}
