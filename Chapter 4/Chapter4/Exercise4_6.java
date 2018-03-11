
public class Exercise4_6 {
	public static void main(String[] args) {
		final double RADIUS=40;
		
		double angle1=Math.random()*(2*Math.PI);
		double angle2=Math.random()*(2*Math.PI);
		double angle3=Math.random()*(2*Math.PI);
		
		double x1=RADIUS*Math.cos(angle1);
		double y1=RADIUS*Math.sin(angle1);
		double x2=RADIUS*Math.cos(angle2);
		double y2=RADIUS*Math.sin(angle2);
		double x3=RADIUS*Math.cos(angle3);
		double y3=RADIUS*Math.sin(angle3);
		
		double a=Math.sqrt(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2));
		double b=Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2));
		double c=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		
		double A=Math.acos((b*b+c*c-a*a)/(2*b*c));
		double B=Math.acos((a*a+c*c-b*b)/(2*a*c));
		double C=Math.acos((a*a+b*b-c*c)/(2*a*b));
		
		System.out.println("A="+Math.toDegrees(A));
		System.out.println("B="+Math.toDegrees(B));
		System.out.println("C="+Math.toDegrees(C));
	}
}
