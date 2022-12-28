import java.util.Scanner;
class simpleCalc {
    public static void main(String[] argc) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        double num1 = keyboard.nextDouble();
        keyboard.nextLine(); //clear buffer
        double num2 = keyboard.nextDouble();
        keyboard.nextLine(); //clear buffer

        System.out.println("What operation you want to perform: ");
        char op = keyboard.nextLine().charAt(0);
        //String op = keyboard.nextLine();

        if (op == '+') {
            System.out.printf("%f %s %f = %f\n", num1, op, num2, num1 + num2);
        } else if (op == '-') {
            System.out.printf("%f %s %f = %f\n", num1, op, num2, num1 - num2);
        } else if (op == '/') {
            System.out.printf("%f %s %f = %f\n", num1, op, num2, num1 / num2);
        } else if (op == '*') {
            System.out.printf("%f %s %f = %f\n", num1, op, num2, num1 * num2);
        }

    }
}
