/*******************************
Nicole Tome
June 16, 2020
********************************/
//This program gives the Fahrenheit temperature for a Celsius input. 

import java.util.Scanner;
import java.math.BigInteger;

public class TempConvert {

	public static void main(String[] args) { 
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Celsius Temperature = "); //Display prompt for Celsius 
		double celsius = in.nextDouble(); 
		
		System.out.println("This equals " + (1.80*celsius+32.00) + " Fahrenheit");
		

	}
}
