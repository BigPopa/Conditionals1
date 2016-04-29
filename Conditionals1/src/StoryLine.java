import java.util.Scanner;
public class StoryLine {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("You need to get your NFL football team to be the strongest in the League, build your league by drafting and trading players");
		System.out.println("Your team is given the number 5 draft pick what do you do?");
		System.out.println("Type the number for your decided choice:");
		System.out.println("(1) Trade your pick for David Johnson, the rookie of the year last year");
		System.out.println("(2) Wait for the draft and aim for Ohio State's, Braxton Miller in the draft");
		System.out.println("(3) Attempt Trade your draft pick for the 10th pick in the draft and Matt Forte a veteran runningback");
		int choice = userInput.nextInt();
		if (choice == 1)
		{
			System.out.println("You successfully trade for David Johnson");
		}
		else if (choice == 2)
		{
			System.out.println("You wait for the NFL Draft");
			{
				System.out.println("The draft is here and you have a list of 5 top players you can draft, Troy Smith, Ryan Shazier, Braxton Miller, Jared Sullinger, and Carlos Hyde");
				System.out.println("Lets hope it goes well, it is up to fate, your pick will be randomly picked based on who gets picked ahead of him.");
				int randomNumber = (int) (Math.random()*5)+1;
				if (randomNumber == 1)
				{
					System.out.println("You successfully drafted Hiessman Trophy winner, Troy Smith");
				}
				else if (randomNumber == 2)
				{
					System.out.println("You drafted star Linebacker Ryan Shazier");
				}
				else if (randomNumber == 3)
				{
					System.out.println("You picked Ohio State's Quarterback Braxton Miller");
				}
				else if (randomNumber == 4)
				{
					System.out.println("You ended up with the big offensive lineman Jared Sullinger");
				}
				else if (randomNumber == 5)
				{
					System.out.println("You got the All-Star Runningback Carlos Hyde");
				}
			}
		}
		else if (choice == 3)
		{
			System.out.println("You Trade for the 10th overall pick in the draft and successfully trade for Matt Forte");
		}
	}

}
