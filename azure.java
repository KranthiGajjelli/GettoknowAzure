// Java program to demonstrate Arithmetic Exception 

class GFG { 
	public static void main(String[] args) 
	{ 
		// Number of chocolates in each box 
		int chocolates[] = { 106, 145, 123, 127, 125 }; 

		// Number of students in class 
		int students[] = { 35, 40, 0, 34, 60 }; 

		// Number of chocolates given to each student of a 
		// particular class 
		int numChoc[] = new int[5]; 
				// Number of chocolates given to each student of a 
		// particular class 
				// particular class 
		int numChoc[] = new int[5]; 
				// Number of chocolates given to each student of a 
		// particular class 
		int numChoc[] = new int[5]; 
		try { 
			for (int i = 0; i < 5; i++) { 
				// Calculating the chocolates 
				// to be distributed 
				numChoc[i] = chocolates[i] / students[i]; 
			} 
		} 
		// Catching Divide by Zero Exception 
		catch (ArithmeticException error) { 
			System.out.println("Arithmetic Exception"); 
			System.out.println(error.getMessage() 
							+ " error."); 
		} 
	} 
}
