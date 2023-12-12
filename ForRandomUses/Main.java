package ForRandomUses;


public class Main {
  public int findSpecialInteger(int[] arr) {
    int totalLength = arr.length;
    return totalLength;
  }

  public static void main(String[] args) {
    // Creating an instance of the class
    Main mainObject = new Main();

    // Creating an array
    int[] myArray = {1, 2, 2, 6, 6, 6, 6, 7, 10};

    // Invoking the findSpecialInteger method and storing the result
    int result = mainObject.findSpecialInteger(myArray);

    // Printing the result
    System.out.println("Total length: " + result);
  }
}
