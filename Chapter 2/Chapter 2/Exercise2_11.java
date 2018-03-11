import java.util.Scanner;

public class Exercise2_11 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double year=365.0*24*60*60;
		int currNumber=312032486;		//定义当前人口总数
		double born=year/7;
		double death=year/13;
		double immigration=year/45;
		
		System.out.print("Enter the number of years: ");
		int numberOfYears=input.nextInt();
		int population=(int)(currNumber+(born-death+immigration)*numberOfYears);
		System.out.println("The population in "+numberOfYears+" years is "+population);
		
		
		
	}
}
