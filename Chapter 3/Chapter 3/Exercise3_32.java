import java.util.Scanner;

public class Exercise3_32 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter three points for p0,p1,and p2: ");
		double x0=input.nextDouble();
		double y0=input.nextDouble();
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		
		double x=(x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
		
		System.out.print("("+x2+","+y2+") is ");
		if(x>0)
			System.out.print("on the left side of the line ");
		else if(x==0)
			System.out.print("on thr line ");
		else
			System.out.print("on the right side of the line ");
		
		System.out.println("from ("+x0+","+y0+") to ("+x1+","+y1+")");
		
	}
}
