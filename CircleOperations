/***************************************************
Nicole Tome
June 20, 2020
***************************************************/
// This program calculates the appropriate area, diameter or circumference of a circle once the radius is inputted by the user. 


import java.util.Scanner;

	public class CircleOperations {

		public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the Radius = "); //Display prompt for Radius input
			double radius = in.nextDouble(); 
			
			System.out.println("To calculate Diameter, Circumference or Area, enter D, C, or A below.");
			System.out.print("Enter Code = "); //Display prompt for choosing calculation
			String code = in.next();
			
			if (code.equals("A"))
			{
				double area = Math.PI * (radius * radius); //Calculation for area of circle
				System.out.println("The area of a circle with radius " + radius + " is " + area);
			}
			
			if (code.equals("D"))
			{
				double diameter = 2*radius;  //Calculation for diameter of circle
				System.out.println("The diameter of a circle with radius " + radius + " is " + diameter);
			}
			
			if (code.equals("C"))
			{
				double circumference = Math.PI * 2*radius; //Calculation for circumference
				System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
			}
			
	}

}
