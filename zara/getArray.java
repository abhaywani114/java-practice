import java.util.Scanner;
class getArray {
  public static void main(String[] argv) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("How many element you want in array: ");
    int size = keyboard.nextInt();
    int[] array_1 = new int[size];
    System.out.println("Enter elements to fill into arrray:");
    for(int i = 0; i < array_1.length; i++) {
      array_1[i] = keyboard.nextInt();
    }

    System.out.println("The elements in array are: ");
    for(int elements:array_1)
      System.out.print(elements + "\t");
    System.out.println();

    System.out.println("The soreted elements in array are: ");
    getArray obj1  = new getArray();
    obj1.sortArray(array_1);
    for(int elements:(array_1))
      System.out.print(elements + "\t");
    System.out.println();

  }

  public int[] sortArray(int[] myArray) {
    for(int i = 0; i < myArray.length; i++) {
      for (int  j = 0 ; j < myArray.length - i - 1; j++) {
        if (myArray[j] > myArray[j+1]) {
          int temp = myArray[j];
          myArray[j]  = myArray[j+1];
          myArray[j+1] = temp;
        }
      }
    }
    return myArray;
  }
}
