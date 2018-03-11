import java.util.Scanner;

public class Exercise2_10 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double amountOfWater=input.nextDouble();
		System.out.print("Enter the intital temperature: ");
		double intitalTemp=input.nextDouble();
		System.out.print("Enter the final temperature: ");
		double finalTemp=input.nextDouble();
		
		double energy=amountOfWater*(finalTemp-intitalTemp)*4184;
		
		System.out.print("The energy needed is "+energy);
		
	}
}
