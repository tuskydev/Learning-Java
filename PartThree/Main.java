package PartThree;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public interface Main {
  public static void main(String[] args) {
    // Scanner x = new Scanner(System.in);
    // System.out.print("Customer number: ");
    // int y = Integer.valueOf(x.nextLine());

    // if (y >= 1000 && y % 25 == 0) {
    //   System.out.println("Gets a gift card!");
    // } else if (y % 2000 == 0) {
    //   System.out.println("Gets a large gift card!");
    // } else {
    //   System.out.println("Gets nothing.");
    // }
    ArrayList<Object> sections = new ArrayList<>();

    sections.add("First");
    sections.add("Second");
    System.out.println(sections.get(1));
  }
}
