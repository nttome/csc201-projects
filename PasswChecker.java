/*******************************************
Nicole Tome
August 20, 2021 
*******************************************/
//This program checks submitted password against the 10 most commonly used passwords for safety. Prompts for re-entry if user input matches commonly used list. 

import java.util.Scanner;
public class Unit6Ex6
{

        private static String[] common_pass = {"123456","123456789","qwerty","password","111111","12345678","abc123","1234567","password1","12345"};
        public static boolean isNotCommon(String password)
        {
                for(int i=0;i<common_pass.length;i++)
                {
                	if(common_pass[i].equals(password))
                		return false;
                }
                return true;
        }
        public static void main(String[] args)
        {
        	
                Scanner sc = new Scanner(System.in);
                String password;
                
                while(true){
                        System.out.print("Enter a Password: ");
                        password = sc.nextLine();  
                        if(isNotCommon(password))
                        {
                                System.out.println("Password Accepted as safe!");
                                break;
                        }
                        System.out.println("Password is too common, please try again.");

                }
        }
}
