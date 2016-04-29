import java.util.Scanner;

public class TwentyQuestions 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome, we are going to play 3 Questions");
		System.out.println("You will pick any animal you can think of and I will have 6 Questions!");
		Scanner userInput = new Scanner(System.in);
		System.out.println("Ready? First Question, what kind of animal is it?");
		System.out.println(" (1) Mammal");
		System.out.println(" (2) Reptile");
		System.out.println(" (3) Bird");
		System.out.println(" (4) Amphibian");
		int choice = userInput.nextInt();
		if (choice == 1)
			{
				Scanner userInput1 = new Scanner(System.in);
				System.out.println("Mammal, huh? Okay now for Question 2, what is its diet?");	
				System.out.println(" (1) Carnivore");
				System.out.println(" (2) Omnivore");
				System.out.println(" (3) Herbivore");
				int diet1 = userInput1.nextInt();
				if (diet1 == 1)
				{
					Scanner userInput11 = new Scanner(System.in);
					System.out.println("A Carnivarous Mammal, it must be a Bear!");
					System.out.println(" (1) Yes");
					System.out.println(" (2) No");
					int animal1 = userInput11.nextInt();
					if (animal1 == 1)
					{
						System.out.println("YAY I win!");
					}
					else if (animal1 == 2)
					{
						System.out.println("You must be mistaken and picked an animal not on the list");
					}
				}
				else if (diet1 == 2)
				{
					Scanner userInput12 = new Scanner(System.in);
					System.out.println("A Mammal that is an omnivore, it has to be a Human!");
					System.out.println(" (1) Yes");
					System.out.println(" (2) No");
					int animal2 = userInput12.nextInt();
					if (animal2 == 1)
					{
						System.out.println("YAY I win!");
					}
					else if (animal2 == 2)
					{
						System.out.println("You must be mistaken and picked an animal not on the list");
					}
				}
				else if (diet1 == 3)
				{
					Scanner userInput13 = new Scanner(System.in);
					System.out.println("A Mammal that eats Green, next question, is it a Deer?");
					System.out.println(" (1) Yes");
					System.out.println(" (2) No");
					int animal2 = userInput13.nextInt();
					if (animal2 == 1)
					{
						System.out.println("YAY I win!");
					}
					else if (animal2 == 2)
					{
						System.out.println("You must be mistaken and picked an animal not on the list");
					}
				}
			}
		else if (choice == 2)
			{
				Scanner userInput2 = new Scanner(System.in);
				System.out.println("Reptiles, good choice! Question 2, what is its diet?");
				System.out.println(" (1) Carnivore");
				System.out.println(" (2) Omnivore");
				System.out.println(" (3) Herbivore");
				int diet2 = userInput2.nextInt();
				if (diet2 == 1)
				{
					Scanner userInput21 = new Scanner(System.in);
					System.out.println("A Carnivarous Reptile, next question, is it a Snake?");
					System.out.println(" (1) Yes");
					System.out.println(" (2) No");
					int animal2 = userInput21.nextInt();
					if (animal2 == 1)
					{
						System.out.println("YAY I win!");
					}
					else if (animal2 == 2)
					{
						System.out.println("You must be mistaken and picked an animal not on the list");
					}
				}
				else if (diet2 == 2)
				{
					Scanner userInput22 = new Scanner(System.in);
					System.out.println("A Reptile that is an omnivore, next question, is it a Bearded Dragon?");
					System.out.println(" (1) Yes");
					System.out.println(" (2) No");
					int animal2 = userInput22.nextInt();
					if (animal2 == 1)
					{
						System.out.println("YAY I win!");
					}
					else if (animal2 == 2)
					{
						System.out.println("You must be mistaken and picked an animal not on the list");
					}
				}
				else if (diet2 == 3)
				{
					Scanner userInput23 = new Scanner(System.in);
					System.out.println("A Reptile that eats Green, next question, is it a tortoise?");
					System.out.println(" (1) Yes");
					System.out.println(" (2) No");
					int animal2 = userInput23.nextInt();
					if (animal2 == 1)
					{
						System.out.println("YAY I win!");
					}
					else if (animal2 == 2)
					{
						System.out.println("You must be mistaken and picked an animal not on the list");
					}
				}
			}
		else if (choice == 3)
			{
				Scanner userInput3 = new Scanner(System.in);
				System.out.println("Birds, good choice! Question 2, what is its diet?");
				System.out.println(" (1) Carnivore");
				System.out.println(" (2) Omnivore");
				System.out.println(" (3) Herbivore");
				int diet3 = userInput3.nextInt();
				if (diet3 == 1)
				{
					System.out.println("A Carnivarous Bird, next question");
				}
				else if (diet3 == 2)
				{
					System.out.println("A Bird that is an omnivore, next question");
				}
				else if (diet3 == 3)
				{
					System.out.println("A Bird that eats Green, next question");
				}
			}
		else if (choice == 4)
			{
			Scanner userInput4 = new Scanner(System.in);
				System.out.println("Interesting Amphibian! ");
				System.out.println(" (1) Carnivore");
				System.out.println(" (2) Omnivore");
				System.out.println(" (3) Herbivore");
				int diet4 = userInput4.nextInt();
				if (diet4 == 1)
				{
					System.out.println("A Carnivarous Amphibian, next question");
				}
				else if (diet4 == 2)
				{
					System.out.println("An Amphibian that is an omnivore, next question");
				}
				else if (diet4 == 3)
				{
					System.out.println("An Amphibian that eats Green, next question");
				}
			}
	}

}
