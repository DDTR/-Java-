import java.util.Scanner;

public class Exercise4_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter point 1(latitude and longitude) in degrees:");
		String string1=input.nextLine();
		System.out.print("Enter point 2(latitude and longitude) in degrees:");
		String string2=input.nextLine();
		
		int k=string1.indexOf(',');
		double x1=Double.parseDouble(string1.substring(0, k));
		double y1=Double.parseDouble(string1.substring(k+1));
		k=string2.indexOf(',');
		double x2=Double.parseDouble(string2.substring(0, k));
		double y2=Double.parseDouble(string2.substring(k+1));
		
		double x1Radians=Math.toRadians(x1);
		double y1Radians=Math.toRadians(y1);
		double x2Radians=Math.toRadians(x2);
		double y2Radians=Math.toRadians(y2);
		
		double d=6371.01*Math.acos(Math.sin(x1Radians)*Math.sin(x2Radians)+
				Math.cos(x1Radians)*Math.cos(x2Radians)*Math.cos(y1Radians-y2Radians));
		
		System.out.println("The distance between the two points is "+d+" km");
		
	}
}
