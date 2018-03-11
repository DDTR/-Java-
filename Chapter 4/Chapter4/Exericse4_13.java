import java.util.Scanner;

public class Exericse4_13 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a letter:");
		String i=input.nextLine();
		char letter=i.charAt(0);
		
		if((letter>='a'&&letter<='z')||(letter>='A'&&letter<='Z')) {
			if(letter=='A'||letter=='a'||
			   letter=='E'||letter=='e'||
		       letter=='I'||letter=='i'||
		       letter=='O'||letter=='o'||
		       letter=='U'||letter=='u') {
				 System.out.println(letter+" is a vowel");
			}
			else {
				System.out.println(letter+" is a consonant");
			}
		}
		else {
			System.out.println(letter+" is an invalid input");
		}
		
	}
}
