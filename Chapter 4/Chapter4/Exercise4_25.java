
public class Exercise4_25 {
	public static void main(String[] args) {
		char letter1=(char)('A'+(int)(Math.random()*26));
		char letter2=(char)('A'+(int)(Math.random()*26));
		char letter3=(char)('A'+(int)(Math.random()*26));
		
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		int number3=(int)(Math.random()*10);
		int number4=(int)(Math.random()*10);
		
		System.out.println("The random car license is "+letter1+letter2+letter3+
				number1+number2+number3+number4);
		
	}
}
