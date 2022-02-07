/********************************
Nicole Tome
August 25, 2021
********************************/
//This program allows entry of employees by hourly wafe and number of hours, auto calculates gross pay, tax withholding and net totals for all employees entered. 


import java.util.Scanner;
public class PayrollCalculator {
	  
		   public static double getPercent(double grossPay) {
		       if(grossPay<=200) //If gross pay under or equal $200, tax rate = 10%
		           return 10;
		       else if (grossPay<=350) //If gross pay under or equal $350, tax rate = 14%
		           return 14;
		       else if(grossPay<=500) // If gross pay under or equal $500, tax rate = 18%
		           return 18;
		       return 22;
		   }

		   public static void main(String[] args) {
		       Scanner sc = new Scanner(System.in);
		       double grossPay,netPay,percent,tax,totaltax=0,totalGross=0,totalNet=0, wage,hour,totalHour=0;
		       String name;
		       System.out.print("Enter employee name or XXX to exit: ");
		       name = sc.nextLine();
		       while(!name.equals("XXX")) {
		           System.out.print("Enter hourly wage: $");
		           wage = sc.nextDouble();
		           System.out.print("Enter hours: ");
		           hour = sc.nextDouble();
		           sc.nextLine();
		           totalHour+=hour;
		           grossPay=hour*wage;
		           totalGross+=grossPay;
		           percent = getPercent(grossPay);
		           tax = grossPay*percent/100.0;
		           totaltax+=tax;
		           netPay=grossPay-tax;
		           totalNet+=netPay;
		           System.out.println("Name: "+name+"\nHourly Wage: $"+wage+"\nHours worked: "+hour+"\nGross pay: $"+grossPay+"\nWitholding percent %: "+percent+"\nWitholding tax amount: $"+tax+"\nNet pay: $"+netPay);
		           System.out.println("===================================");
		           System.out.print("Enter employee name or XXX to exit: "); //Prompt for user input
		           name = sc.nextLine();
		       } 
           //Summary totals of all employees entered
		       System.out.println("Total hours of all employees: "+totalHour);
		       System.out.println("Total gross payroll of all employees: $"+totalGross);
		       System.out.println("Total tax witholding of all employees: $"+totaltax);
		       System.out.println("Total net payroll of all employees this payroll: $"+totalNet);
		      
sc.close();
		   }

		
	}
