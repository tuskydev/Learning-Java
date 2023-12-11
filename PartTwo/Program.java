package PartTwo;

import java.util.Scanner;

public class Program {
  public static void main(String[] main) {
    // Creating the scanner
    Scanner scanner = new Scanner(System.in);

    // Example of reading different types of user input
    // String text = reader.nextLine();
    // int number = Integer.valueOf(reader.nextLine());
    // double numberWithDecimals = Double.valueOf(reader.nextLine());
    // boolean trueOrFalse = Boolean.valueOf(reader.nextLine());

    try {
      // Example of reading different types of user input
      int number = Integer.valueOf(scanner.nextLine());
      int result = number * 2;
      System.out.println(result);
    } finally {
      // Closing the scanner in a finally block
      scanner.close();
    }

  }
}
