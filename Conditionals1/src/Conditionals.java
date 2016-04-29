import java.util.Scanner;
public class Conditionals {

	public static void main(String[] args){
		
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("How old are you?");
	int age = userInput.nextInt();
	
	{
		if (age > 16)
		{
			System.out.println("You are looking great today!");
		}
		if (age < 16)
		System.out.println("Go away nerd");
		if (age == 16)
		System.out.println("You are okay I guess");
	}

}
}