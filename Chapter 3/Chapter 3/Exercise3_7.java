//ComputeChange
import java.util.Scanner;

public class Exercise3_7 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an amonut in double for example 11.56: ");
		double amount=input.nextDouble();
		int remainAmount=(int)(amount*100);
		
		
		int amountOfDollars=remainAmount/100;
		remainAmount=remainAmount%100;
		
		int amountOfQuarters=remainAmount/25;
		remainAmount=remainAmount%25;
		
		int amountOfDimes=remainAmount/10;
		remainAmount=remainAmount%10;
		
		int amountOfNickels=remainAmount/5;
		int amountOfPennys=remainAmount%5;
		
		System.out.println("Your amount "+amount+" const of");
		System.out.println("      "+amountOfDollars+(amountOfDollars>1?" dollars":" dollar"));
		System.out.println("      "+amountOfQuarters+(amountOfQuarters>1?" quartes":" quarte"));
		System.out.println("      "+amountOfDimes+(amountOfDimes>1?" dimes":" dime"));
		System.out.println("      "+amountOfNickels+(amountOfNickels>1?" nickels":" nickel"));
		System.out.println("      "+amountOfPennys+(amountOfPennys>1?" pennys":" penny"));
	}
}