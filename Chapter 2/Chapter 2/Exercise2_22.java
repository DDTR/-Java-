import java.util.Scanner;

public class Exercise2_22 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an amonut in int for example 11.56: ");
		int amount=input.nextInt();
		int remainAmount=amount;
		
		
		int amountOfDollars=remainAmount/100;
		remainAmount=remainAmount%100;
		
		int amountOfQuarters=remainAmount/25;
		remainAmount=remainAmount%25;
		
		int amountOfDimes=remainAmount/10;
		remainAmount=remainAmount%10;
		
		int amountOfNickels=remainAmount/5;
		int amountOfPennys=remainAmount%5;
		
		System.out.println("Your amount "+amount/100.0+" const of");
		System.out.println("      "+amountOfDollars+" dollars");
		System.out.println("      "+amountOfQuarters+" quartes");
		System.out.println("      "+amountOfDimes+" dimes");
		System.out.println("      "+amountOfNickels+" nickels");
		System.out.println("      "+amountOfPennys+" pennys");
	}
}
