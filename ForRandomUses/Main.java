package ForRandomUses;


public class Main {
  public int findSpecialInteger(int[] arr) {
    int currInt = arr.length / 2;

    while (True) {
      int newInt = currInt / 2;
      if (currInt == newInt) {
        return newInt;
      } else {

      }
    }
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
