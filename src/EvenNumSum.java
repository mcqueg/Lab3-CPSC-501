import java.util.Scanner;

//********************************************************************
//Garrett McCue 	
//
//7/22/20
//
//CPSC-501-Lab3Ex2
//********************************************************************
public class EvenNumSum {

	// ----------------------------------------------------------------
	// reads in an integer value and prints the sum of all even
	// integers between 2 and input value inclusively.
	// ----------------------------------------------------------------

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int user_num;
		int even_num_sum = 0;

		System.out.print("Enter an integer greater than or equal to 2:  ");
		user_num = scan.nextInt();

		// checks if user_num is greater than 1.
		// if it is not, it prompts user to enter another number.
		while (user_num < 2) {
			System.out.println("Please try again.");
			System.out.print("Enter an integer greater than or equal to 2: ");
			user_num = scan.nextInt();
		}

		// loops through numbers up to user_num while adding all even values
		// and storing in the variable even_num_sum.
		for (int count = 0; count <= user_num; count++) {
			if (count % 2 == 0) {
				even_num_sum = even_num_sum + count;
				}

			}
		
		System.out.println("Sum of even numbers: " + even_num_sum);
	}

}
