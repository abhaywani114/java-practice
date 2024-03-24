import java.util.Random;

public class Ex2Demo {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = 0, b = 0, c = 0;
        for(int i = 0; i  < 32; i++) {
            try {
                b = rand.nextInt();
                c = rand.nextInt();
                a = 1234 / (c/b);                
            }   catch (ArithmeticException e) {
                System.out.println("Division by zero.");
                a = 0;
            } finally {
                System.out.println("a: " + a);
            }
        }
    }    
}
