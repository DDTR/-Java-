import java.util.Scanner;

public class Exercise3_1 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a,b,c: ");
		float a=input.nextFloat();
		float b=input.nextFloat();
		float c=input.nextFloat();
		
		float judge=b*b-4*a*c;
		
		if(judge>0) {
			double r1=(-b+Math.pow(judge,0.5))/(2*a);
			double r2=(-b-Math.pow(judge,0.5))/(2*a);
			System.out.println("The equation has two roots "+r1+" and "+r2);
		}
		else if(judge==0) {
			double r=-b/(2*a);
			System.out.println("The equation has one root "+r);
		}
		else
			System.out.println("The equation has no real roots");
	}
}
