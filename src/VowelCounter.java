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
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		int otherCount = 0;

		System.out.print("Enter string: ");
		user_str = scan.nextLine();
		user_str = user_str.toLowerCase();
		
		// loops through user_str characters and counts each vowel
		for (int i = 0; i < user_str.length(); i++) {

			char chr = user_str.charAt(i);

			if (chr == 'a') {
				aCount++;
			}

			else if (chr == 'e') {
				eCount++;
			}

			else if (chr == 'i') {
				iCount++;
			}
			
			else if (chr == 'o') {
				oCount++;
			}
			
			else if (chr == 'u') {
				uCount++;
			}

			else
				otherCount++;
		}	
		
		System.out.println("Vowel count");
		System.out.println("\ta: " + aCount);
		System.out.println("\te: " + eCount);
		System.out.println("\ti: " + iCount);
		System.out.println("\to: " + oCount);
		System.out.println("\tu: " + uCount);
		System.out.println("Non-vowel count: " + otherCount);
		
		scan.close();
	}
}
