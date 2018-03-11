import java.util.Scanner;

public class Exercise3_28 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter r1's center x-,y-coordinates,width,and height: ");
		double xr1=input.nextDouble();
		double yr1=input.nextDouble();
		double widthR1=input.nextDouble();
		double heightR1=input.nextDouble();
		
		System.out.print("Enter r1's center x-,y-coordinates,width,and height: ");
		double xr2=input.nextDouble();
		double yr2=input.nextDouble();
		double widthR2=input.nextDouble();
		double heightR2=input.nextDouble();
		
		double xSpace=Math.pow(Math.pow(xr1-xr2, 2), 0.5);
		double ySpace=Math.pow(Math.pow(yr1-yr2, 2), 0.5);
		
		if(xSpace+widthR2/2<=widthR1/2&&ySpace+heightR2/2<=heightR1/2)
			System.out.println("r2 is inside r1");
		else if(xSpace<=(widthR1+widthR2)/2&&ySpace<=(heightR1+heightR2)/2)
			System.out.println("r2 overlaps r1");
		else
			System.out.print("r2 does not overlaps r1");
	}
}
