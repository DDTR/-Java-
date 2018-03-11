
public class Exercise3_24 {
	public static void main(String[] arg) {
		int playCard=(int)(Math.random()*13)+1;
		int suit=(int)(Math.random()*4);
		
		System.out.print("The card you picked is ");
		
		switch(playCard) {
		case 1:System.out.print("Ace");break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:System.out.print(playCard);break;
		case 11:System.out.print("Jack");break;
		case 12:System.out.print("Queen");break;
		case 13:System.out.print("King");
		}
		
		switch(suit) {
		case 0:System.out.print(" of Clubs");break;
		case 1:System.out.print(" of Diamonds");break;
		case 2:System.out.print(" of Hearts");break;
		case 3:System.out.print(" of Spades");
		}
	}
}
