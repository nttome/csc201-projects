/******************************
Nicole Tome
July 1, 2020
*****************************/
//This program designates the number of days in each month. 


import java.util.Scanner;
public class CalendarDays {

	public static void main(String[] args) {
{
	Scanner sc=new Scanner(System.in);

	String month[] ={"January","February","March","April","May","June","July","August","September","October","November","December"};
	int days[]={31,28,31,30,31,30,31,31,30,31,30,31};

	for(int i=0; i<12;i++) {
	System.out.println(month[i]+" has "+days[i]+" days.");
	sc.close();
	}
	}
}
}
