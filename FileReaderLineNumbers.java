/***************************************************
Nicole Tome
July 15, 2020
***************************************************/
//This program reads and displays a user inputted file, with line numbers. 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class FileReaderLineNumbers {

    public static void main(String[] args) throws IOException {
    	
    	System.out.println("Enter exact file pathway and name below:"); //User prompt for file name and pathway
    	Scanner keyboard = new Scanner(System.in); 
    	String filename = keyboard.nextLine();
    	File file = new File(filename); 
    	Scanner inputFile = new Scanner(file); 
        
        readUsingBufferedReader(filename);
    }

    private static void readUsingBufferedReader(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int linecount=1;   //establishes first line in loop linecount as 1 
        String line; 
        while((line = br.readLine()) != null){ //Reads and displays lines until there is no more string text
        	System.out.println(linecount +". " + line);  //Displays linecount followed by line string text
            linecount++;   //Adds 1 to each linecount- aka updates linecount loop
        }
        br.close(); 
        fr.close();
    }

}
