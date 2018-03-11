import java.util.Scanner;

public class Exercise2_13 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		final double rate=1.00417;
		System.out.print("Enter the monthly saving amount: ");
		double monthlyAmount=input.nextDouble();
		
		double accountValue=monthlyAmount*rate;
		accountValue=(monthlyAmount+accountValue)*rate;
		accountValue=(monthlyAmount+accountValue)*rate;
		accountValue=(monthlyAmount+accountValue)*rate;
		accountValue=(monthlyAmount+accountValue)*rate;
		accountValue=(monthlyAmount+accountValue)*rate;
		
		System.out.printf("After the six month, thr account value is $%4.2f",accountValue);
		
	}
}
