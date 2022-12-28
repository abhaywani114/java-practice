import java.util.Scanner;
class getInput {
    public static void main(String[] argv) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your name?");
        String name = keyboard.nextLine();
        System.out.println(String.format("Your name is %s", name));


        keyboard.close();
    }
}
