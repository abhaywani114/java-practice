import java.util.Scanner;
class fTint {
  public static void main(String[] argv) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a float number:10");
    float flt = keyboard.nextFloat();
    int converted_number = (int) flt;
    System.out.println("Number after conversion to float: " + converted_number);
  }
}
