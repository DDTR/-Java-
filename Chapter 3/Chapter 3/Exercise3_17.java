import java.util.Scanner;

public class Exercise3_17 {
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		
		int computerNumber=(int)(Math.random()*3);
		System.out.print("scissor(0),rock(1),paper(2): ");
		int userNumber=input.nextInt();
		
		System.out.print("The computer is ");
		
		switch(computerNumber) {
		case 0:
			System.out.print("scissor. ");
			if(userNumber==0)
				System.out.print("You are scissors.It is draw.");
			else if(userNumber==1)
				System.out.print("You are rock.You loss.");
			else
				System.out.print("You are paper.You loss.");
			break;
		case 1:
			System.out.print("rock. ");
			if(userNumber==0)
				System.out.print("You are scissors.You loss.");
			else if(userNumber==1)
				System.out.print("You are rock.It is draw.");
			else
				System.out.print("You are paper.You win.");
			break;
		case 2:System.out.print("paper. ");
			if(userNumber==0)
				System.out.print("You are scissors.You win.");
			else if(userNumber==1)
				System.out.print("You are rock.You loss.");
			else
				System.out.print("You are paper.It is draw.");
			break;
		}
		
	}
}
