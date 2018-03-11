import java.util.Scanner;

public class Exercise2_14 {
	public static void main(String[] arg) {
		final double KILOGRAMS_PER_POUND=0.45359237;
		final double METERS_PER_INCH=0.0254;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter weigth in pounds: ");
		double weight=input.nextDouble();
		System.out.print("Enter heigth in inches: ");
		double height=input.nextDouble();
		weight*=KILOGRAMS_PER_POUND;
		height*=METERS_PER_INCH;
		double BMI=weight/(height*height);
		
		System.out.printf("BMI is %5.4f",BMI);
		
		
	}
}
