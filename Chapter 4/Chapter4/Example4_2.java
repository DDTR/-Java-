//OrderTwoCities
import java.util.Scanner;

public class Example4_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the first city: ");
		String city1=input.nextLine();
		System.out.print("Enter the second city: ");
		String city2=input.nextLine();
		
		if(city1.compareTo(city2)<0)		//city1第一个不同字母顺序小于city2成立
			System.out.println("The cities in alphabetical order are "+
					city1+" and "+city2);
		else
			System.out.println("The cities in alphabetical order are "+
					city2+" and "+city1);
	}
}
