/*******************************
Nicole Tome
January 1, 2021
*******************************/
//This program calculates the daycare rate of children based on age and number of days. Cumulative summary posted at program exit. 

import java.util.*;

public class DaycareRate
 {
   public static void main(String args[])
   { 
     Scanner in = new Scanner(System.in);
     double rate[][]={
       {30.00,60.00,88.00,115.00,140.00},
       {26.00,52.00,70.00,96.00,120.00},
       {24.00,46.00,67.00,89.00,110.00},
       {22.00,40.00,60.00,75.00,88.00},
       {20.00,35.00,50.00,66.00,84.00}
     };
     double total=0;
     while(true)
     {
       System.out.print("Enter age of child: ");
       int n=in.nextInt();
       System.out.print("Enter number of days: ");
       int d=in.nextInt();
       if(n<4) //if child age is less than 4
       {
         total=total+rate[n][d-1];
       }
       else //if age is more than 4 choose last row
       {
         total=total+rate[4][d-1]; //d-1 defines index
       }
       System.out.print("Do you want to add other child? (y/n): ");
       char ch=in.next().charAt(0);
       if(ch=='n')
         break;
     }
     System.out.printf("Total rate is $%.2f",total);
   }
 }
