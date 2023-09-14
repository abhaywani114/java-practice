import java.util.Scanner;
class program2 {
  public static void main(String[] argv) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number:");
    int input = sc.nextInt();
    int factorial = 1;
    for (int i = 1; i <= input; i++) {
        factorial = factorial * i;
    }
    System.out.println("The factorial is: " + factorial);
  }
}
