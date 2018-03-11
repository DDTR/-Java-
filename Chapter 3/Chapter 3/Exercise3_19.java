import java.util.Scanner;

public class Exercise3_19 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter three edges of triangle: ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		
		if(a+b>c&&a+c>b&&b+c>a)
			System.out.println("The perimeter of triganle is "+(a+b+c));
		else
			System.out.println("Error input");
	}
}
