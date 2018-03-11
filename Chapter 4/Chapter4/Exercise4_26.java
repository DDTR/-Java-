
import java.util.Scanner;

public class Exercise4_26 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an amonut in double for example 11.56: ");
		String amount=input.nextLine();
		int dot=amount.indexOf('.');
		int amountOfDollars=Integer.parseInt(amount.substring(0, dot));
		int remainAmount=Integer.parseInt(amount.substring(dot+1));
	
		
		int amountOfQuarters=remainAmount/25;
		remainAmount=remainAmount%25;
		
		int amountOfDimes=remainAmount/10;
		remainAmount=remainAmount%10;
		
		int amountOfNickels=remainAmount/5;
		int amountOfPennys=remainAmount%5;
		
		System.out.println("Your amount "+amount+" const of");
		System.out.println("      "+amountOfDollars+" dollars");
		System.out.println("      "+amountOfQuarters+" quartes");
		System.out.println("      "+amountOfDimes+" dimes");
		System.out.println("      "+amountOfNickels+" nickels");
		System.out.println("      "+amountOfPennys+" pennys");
	}
}
