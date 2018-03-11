//ConvertFootToMeter
import java.util.Scanner;

public class Exercise2_3 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		//Prompt to enter the feet
		System.out.print("Enter a value for feet: ");
		double feet=input.nextDouble();
		double meter=(int)(feet*0.305*10000)/10000.0;
		
		//Display the results
		System.out.println(feet+" feet is "+meter+" meters.");
		
		
	}

}
