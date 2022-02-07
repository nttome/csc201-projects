/***************************************************
Nicole Tome
July 17, 2021
***************************************************/
// This program accepts a single letter input from the user and displays the corresponding digit on the telephone


import java.util.Scanner;

	public class Selection {

		public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a single capital letter, and I will tell you what the corresponding digit is on the telephone.");
		System.out.print("Enter  = "); //Display prompt for user input
		String letter = in.next();
		
		if(!letter.equals("A") && !letter.equals("B") && !letter.equals("C")
				&&!letter.equals("D")&&!letter.equals("E")&&!letter.equals("F")
				&&!letter.equals("G")&&!letter.equals("H")&&!letter.equals("I")
				&&!letter.equals("J")&&!letter.equals("K")&&!letter.equals("L")
				&&!letter.equals("M")&&!letter.equals("N")&&!letter.equals("O")
				&&!letter.equals("P")&&!letter.equals("Q")&&!letter.equals("R")&&!letter.equals("S")
				&&!letter.equals("T")&&!letter.equals("U")&&!letter.equals("V")
				&&!letter.equals("W")&&!letter.equals("X")&&!letter.equals("Y")&&!letter.equals("Z"))
				{
				System.out.println ("Sorry, " + letter + " is not a valid input. Please type a capital letter A through Z.");
				}
				
		 
		else if (letter.equals("A")||letter.equals("B")||letter.equals("C"))
			{
			System.out.println("The digit 2 corresponds to the letter " + letter + " on the telephone.");
			}
		
		else if (letter.equals("D")||letter.equals("E")||letter.equals("F"))
			{
			System.out.println ("The digit 3 corresponds to the letter " + letter + " on the telephone.");
			}
		
		else if (letter.equals("G")||letter.equals("H")||letter.equals("I"))
			{
			System.out.println("The digit 4 corresponds to the letter " + letter + " on the telephone.");
			}
		
		else if (letter.equals("J")||letter.equals("K")||letter.equals("L"))
			{
			System.out.println("The digit 5 corresponds to the letter " + letter + " on the telephone.");
			}
		
		else if (letter.equals("M")||letter.equals("N")||letter.equals("O"))
			{
			System.out.println("The digit 6 corresponds to the letter " + letter + " on the telephone.");
			}
		
		else if (letter.equals("P")||letter.equals("Q")||letter.equals("R")||letter.contentEquals("S"))
			{
			System.out.println("The digit 7 corresponds to the letter " + letter + " on the telephone.");
			}
		
		else if (letter.equals("T")||letter.equals("U")||letter.equals("V"))
			{
			System.out.println("The digit 8 corresponds to the letter " + letter + " on the telephone.");
			}
		
		else if (letter.equals("W")||letter.equals("X")||letter.equals("Y")||letter.equals("Z"))
			{
			System.out.println("The digit 9 corresponds to the letter " + letter + " on the telephone.");
			}
		
		System.out.println("End of program. Thank you!");

		}	
	}
