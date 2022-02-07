/*****************************
Nicole Tome
August 8, 2020
*****************************/
//This program counts the number of requests for each class type offered at Power Yoga Studio. 

import java.util.Scanner;

public class Unit6Ex5b {

  private static Scanner in = new Scanner(System.in);

  private static final int QUIT = -1;
  private static final int SIZE = 5;

  private static int classNum;

  public static void main(String[] args) {

    // declaration
    int[] classCnt = new int[SIZE];
    String[] classes = new String[] {
      "Relaxing Meditation", "Hot Yoga Experience", "Children's Yoga",
      "Prenatal Yoga", "Senior Yoga"
    };

    getReady();

    while (classNum != QUIT) {
      countClasses(classCnt);
    }

    finishUp(classCnt, classes);
  }

  private static void getReady() {
    System.out.print("Enter a class number or " + QUIT + " to quit: ");
    classNum = in.nextInt();
  }

  private static void countClasses(int[] classCnt) {
    if (classNum >= 1 && classNum <= SIZE) {
      classCnt[classNum - 1] = classCnt[classNum - 1] + 1;
    } else {
      System.out.println("Invalid class number");
    }

    System.out.print("Enter a class number or " + QUIT + " to quit: ");
    classNum = in.nextInt();
  }

  private static void finishUp(int[] classCnt, String[] classes) {
    classNum = 0;
    System.out.println("Results of class requests: Class code / Class Name / Number of Requests");
    while (classNum < SIZE) {
    	System.out.printf("%d / %s / %d\n", classNum + 1, classes[classNum], classCnt[classNum]);
      classNum = classNum + 1;
    }
  }
}
