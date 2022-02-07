/********************************
Nicole Tome
August 1, 2020
*******************************/
//This program displays the class name of the number selected at Power Yoga Studio. 


import java.util.*;
public class YogaClassName {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);  
		
		System.out.println("Enter the class number between 1 and 5");
		
		int classnum=sc.nextInt();
		
		String CLASSNAME[] = {"Relaxing Meditation","Hot Yoga Experience","Childrens Yoga","Prenatal Yoga","Senior Yoga" };
		
		if(classnum <1 | classnum >5)
			System.out.println("Invalid Input");
		else
			System.out.println("The class name of "+ classnum + " is "+CLASSNAME[classnum-1]);
		
	
		sc.close();
	}
	}
