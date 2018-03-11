import java.util.Scanner;

public class Exercise3_8 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter three integer numbers: ");
		int number1=input.nextInt();
		int number2=input.nextInt();
		int number3=input.nextInt();
		
		if(number1>number2) {
			int temp=number2;
			number2=number1;
			number1=temp;
		}
		
		if(number2>number3) {
			int temp=number3;
			number3=number2;
			number2=temp;
		}
		
		if(number1>number2) {
			int temp=number2;
			number2=number1;
			number1=temp;
		}
		
		System.out.println(number1+" "+number2+" "+number3);
	}
}
