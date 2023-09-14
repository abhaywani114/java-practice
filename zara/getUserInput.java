import java.util.Scanner;
class getUserInput {
  public static void main(String[] argv) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How many elements zara have?");
    int size = keyboard.nextInt();

    System.out.println("Enter elements for your array");
    int[] array_1 = new int[size];
    for(int i = 0; i < size; i++) {
        array_1[i] = keyboard.nextInt();
    }

    System.out.println("Received array: ");
    for(int element:array_1) {
      System.out.print(element + "    ");
    }
    System.out.println();
  }
}
