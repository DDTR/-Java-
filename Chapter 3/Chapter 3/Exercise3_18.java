import java.util.Scanner;

public class Exercise3_18 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the weight of package in pounds: ");
		double weight=input.nextDouble();
		
		double cost=0;
		if(weight>0&&weight<=1)
			cost=3.5;
		else if(weight>1&&weight<=3)
			cost=5.5;
		else if(weight>3&&weight<=10)
			cost=8.5;
		else if(weight>10&&weight<=20)
			cost=10.5;
		else {
			System.out.println("the package cannot be shipped");
			System.exit(1);
		}
		
		System.out.println("The cost: "+cost);
	}
}
