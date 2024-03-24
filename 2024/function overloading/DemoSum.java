import java.util.Scanner;

class Sum {
    double sum(double x, double y) {
        return x + y;
    }
    int sum(int x, int y, int z) {
        return x + y + z;
    }
    double sum(int x, int y) {
        return x + y;
    }
}
public class DemoSum {
    public static void main(String agrv[]) {
        Scanner keyboard = new Scanner(System.in);
        Sum s1 = new Sum();
        int a, b, c;
        double m, z;
        System.out.println("Enter value for a: ");
        a = keyboard.nextInt();
        System.out.println("Enter value for b: ");
        b = keyboard.nextInt();
        System.out.println("Enter value for c: ");
        c = keyboard.nextInt();
        System.out.println("Enter value for m: ");
        m = keyboard.nextDouble();
        System.out.println("Enter value for z: ");
        z = keyboard.nextDouble();

        System.out.println("Sum of a and b is " + s1.sum(a, b));
        System.out.println("Sum of a, b and c is " + s1.sum(a, b, c));
        System.out.println("Sum of m and z is: " + s1.sum(m, z));
    }   
}
