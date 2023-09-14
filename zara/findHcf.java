import java.util.Scanner;
class findHcf {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number_1 = keyboard.nextInt();
        System.out.println("Enter second number: ");
        int number_2 = keyboard.nextInt();
        int hcf = 0;
        for(int i = 1; i < number_1 || i < number_2; i++) {
            if (number_1 % i == 0 && number_2  % i == 0)
                hcf = i;
        }
        System.out.println("The hcf given numbers is: " +  hcf);
    }
}