import java.util.Scanner;
class Factorial {
    public static void main(String[] argv) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        int input = keyboard.nextInt();
        int result = 1;
        for(int i = 1; i  <= input; i++) {
            result = result * i;
        }
        System.out.println("The factorial of input number is: "+ result);
    }
}