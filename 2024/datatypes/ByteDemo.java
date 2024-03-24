import java.util.Scanner;
class ByteDemo {
    public static void main(String argv[]) {
        Scanner keyboard = new Scanner(System.in);
        byte b1 = 125;
        System.out.println("Enter some value for byte: ");
        b1 = keyboard.nextByte();
        System.out.println("Entered value for byte is:" + b1);
        byte b2 = 50;
        b2 = (b2 * 2);
    }
}