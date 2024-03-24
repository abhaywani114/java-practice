import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class avgThreeNumber {
    public static void main(String[] args) throws IOException {
        // BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter three numbers: ");
        
        Scanner keyboard =  new Scanner(System.in);
        
        double number1 = keyboard.nextDouble();
        double number2 = keyboard.nextDouble();
        double number3 = keyboard.nextDouble();
        keyboard.close();
        System.out.println("The average is: " + ((number1 + number2 + number3)/3));
    }
    
}