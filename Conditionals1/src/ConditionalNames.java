import java.util.Scanner;
public class ConditionalNames
{

	public static void main(String[] args)
	{
	Scanner userInput = new Scanner(System.in);
	System.out.println("What is your favorite type of pet dog, cat, or other?");
	System.out.println("Please type the number next toe the best choice");
	System.out.println(" (1) dog");
	System.out.println(" (2) cat");
	System.out.println(" (3) other");
	int choice = userInput.nextInt();
	if (choice == 1)
		{
			System.out.println("Dogs are fun, do you like big or small dogs?");	
		}
	else if (choice == 2)
		{
			System.out.println("Cats are cute, but they scratch a lot");
		}
	else
		{
			System.out.println("You are different what a hipster, what is your favorite animal?");
		}
			{
				Scanner userInput2 = new Scanner(System.in);
				String animal = userInput2.nextLine();
				System.out.println("I like " + animal + "s too");
			}
		}
	}
}
