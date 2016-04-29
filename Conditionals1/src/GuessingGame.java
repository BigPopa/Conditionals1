import java.util.Scanner;
public class GuessingGame 
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Lets play a guessing game, guess a number between 1-5");
		int randomNumber = (int) (Math.random()*5)+1;
		int choice = userInput.nextInt();
		if (choice > randomNumber)
		{
			System.out.println("Your guess is a little too big, the number was " + randomNumber);
		}
		else if (choice < randomNumber)
		{
			System.out.println("Your guess is a little too small, the number was " + randomNumber);
		}
		else if (choice == randomNumber)
		{
			System.out.println("Congrats you got it!");
		}
	}
}