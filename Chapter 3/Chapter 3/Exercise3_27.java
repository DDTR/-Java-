import java.util.Scanner;

public class Exercise3_27 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a point's x- and y-coordiantes: ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		
		boolean isInTriangle=x>=0&&x<=200&&y>=0&&y<=100&&
				((y/(x-200))<=(100/-200));
		System.out.println((y/(x-200))<=(100/-200));
		System.out.println("The point "+(isInTriangle?"is":"is not")+
				" in the triangle");
	}
}
