// Take 10 numbers from the user
// We need to increment each number by 1
// We need to print them on screen
// 1,2,3....
// 2,3,4...
// Solution:
// We will ask user to enter 10 number
// store them in an array (1d)
// then we will loop over array and will incremnt
// by 1
// then we will just print that array
import java.util.Scanner;
class program1 {
  public static void main(String[] argv) {
    Scanner keyboard = new Scanner(System.in);
    
    int[] array_1 = new int[10];
   
    System.out.println("Enter 10 elements: ");
    for(int i = 0; i < array_1.length; i++) {
      array_1[i] = keyboard.nextInt();
    }
    
    for(int i = 0; i < array_1.length;i++) {
      array_1[i] = array_1[i] + 1;
    }

    System.out.print("Incemented array: ");
    for(int element:array_1) {
      System.out.print(element + " ");
    }
    System.out.println();
  }
}
