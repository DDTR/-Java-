import java.util.Scanner;

public class Exercise3_34 {
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
	
		if(x==0&&((x2-x0)*(x1-x2))>=0&&((y2-y0)*(y1-y2))>=0)
			System.out.print("on the line segment ");
		else
			System.out.print("not on the line segment");
		
		System.out.println("from ("+x0+","+y0+") to ("+x1+","+y1+")");
		
	}
}
