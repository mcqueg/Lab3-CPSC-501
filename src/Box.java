//********************************************************************
//Garrett McCue 	
//
//7/23/20
//
//CPSC-501-Lab3Ex4
//********************************************************************

public class Box {

	int size = 0;

	void printBox() {
		// print a set of "*" characters w/ size rows and columns

		for (int i = 0; i < size; i++) 
		{
			for (int x = 0; x < size; x++) 
			{
				System.out.print('*');
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Box Box = new Box();
		Box.size = 5;
		Box.printBox();

	}

}
