
public class Ex3Demo {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 10 / a;
            int[] array  = {1};
            array[99] = 77;
        } catch(ArithmeticException e) {
            System.err.println("Divisible by zero occured");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid array index");
        }
    }    
}
