import java.util.Scanner;

//********************************************************************
//Garrett McCue 	
//
//7/22/20
//
//CPSC-501-Lab3Ex3
//********************************************************************

public class VowelCounter {

	// ----------------------------------------------------------------
	// reads strong from user and then prints the count for each
	// vowel as well as
	// ----------------------------------------------------------------

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String user_str;
		int a_count = 0;
		int e_count = 0;
		int i_count = 0;
		int o_count = 0;
		int u_count = 0;
		int non_vowel_count = 0;

		System.out.print("Enter string: ");
		user_str = scan.nextLine();
		user_str = user_str.toLowerCase();
		
		// loops through user_str characters and counts each vowel
		for (int i = 0; i < user_str.length(); i++) {

			char chr = user_str.charAt(i);

			if (chr == 'a') {
				a_count++;
			}

			else if (chr == 'e') {
				e_count++;
			}

			else if (chr == 'i') {
				i_count++;
			}
			
			else if (chr == 'o') {
				o_count++;
			}
			
			else if (chr == 'u') {
				u_count++;
			}

			else
				non_vowel_count++;
		}	
		
		System.out.println("Vowel count");
		System.out.println("\ta: " + a_count);
		System.out.println("\te: " + e_count);
		System.out.println("\ti: " + i_count);
		System.out.println("\to: " + o_count);
		System.out.println("\tu: " + u_count);
		System.out.println("Non-vowel count: " + non_vowel_count);
		
	}
}
