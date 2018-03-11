//DisplayTime
import java.util.Scanner;
public class Example2_5 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a integer for seconds: ");
		int seconds=input.nextInt();
		int minutes=seconds/60;
		int remainSeconds=seconds
				%60;
		
		System.out.println(seconds+" is "+minutes+" minutes and "+
				remainSeconds+" seconds.");
		
	}

}
