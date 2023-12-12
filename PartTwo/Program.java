package PartTwo;

import java.util.Scanner;

public class Program {
  public static void main(String[] main) {
    // Creating the scanner
    Scanner reader = new Scanner(System.in);

    // Example of reading different types of user input
    // String text = reader.nextLine();
    // int number = Integer.valueOf(reader.nextLine());
    // double numberWithDecimals = Double.valueOf(reader.nextLine());
    // // boolean trueOrFalse = Boolean.valueOf(reader.nextLine());
    // int first = 1;
    // int second = 2;
    // int sum = first + second;

    // System.out.println("The sum of " + first + " and " +
    //  second + " is " + sum);

    // // Assigning the user input to variables
    // int first = Integer.valueOf(reader.nextLine());
    // int second = Integer.valueOf(reader.nextLine());

    // // Identifying the operation and declaring a variable for the result
    // int product = first * second;

    // // Printing the result of the operation
    // System.out.println("The product of " + first +
    // " and " + second + " is " + product);

    // int first = Integer.valueOf(reader.nextLine());
    // int second = Integer.valueOf(reader.nextLine());
    // double squareRoot = Math.sqrt(first+second);

    // System.out.println(squareRoot);

    // int first = Integer.valueOf(reader.nextLine());
    // int second = Integer.valueOf(reader.nextLine());

    // if (first + second > 100) {
    //   System.out.println("too much");
    // } else if (first + second < 100) {
    //   System.out.println("too little");
    // } else {
    //   System.out.println("ok");
    // }

    int first = Integer.valueOf(reader.nextLine());

    if (first < 0) {
      System.out.println(first * -1);
    } else {
      System.out.println(first);
    }
  }
}
