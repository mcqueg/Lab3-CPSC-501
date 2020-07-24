import java.util.Random;
import java.util.Scanner;

//********************************************************************
//Garrett McCue 	
//
//7/20/20
//
//CPSC-501-Lab3Ex1
//********************************************************************

public class AgeGuess {

	// ---------------------------------------------------------------
	// A modified version of AgeGuess that implements while loops
	// in order to give more feedback to the user and allows user to 
	// continue to guess
	// ----------------------------------------------------------------

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random gen = new Random();

		String name;
		int ageGuess;
		int age = gen.nextInt(100);

		System.out.print("Enter name: ");
		name = scan.nextLine();

		System.out.print("Enter age guess: ");
		ageGuess = scan.nextInt();

		System.out.println("name: " + name);
		System.out.println("age guess: " + ageGuess);
		System.out.println("age: " + age);
		

		while (age != ageGuess) {
			System.out.println("You guessed wrong!");

			if (ageGuess < age)
				System.out.println("older");
			else
				System.out.println("younger");
	
			System.out.print("Enter another age guess: ");
			ageGuess = scan.nextInt();

		}

		System.out.println("Good guess!");
	}

}
