
public class Ex1Demo {
    public static void subRoutine() {
        int d = 0;
        int a  = 10 / d;
    }
    public static void main(String[] args) {
        try {
            subRoutine();
        } catch (ArithmeticException e) {
            System.err.println("Error occured while performing subRoutie call: " + e.getMessage());
        } finally {
            System.out.println("Program exec'd");
        }
    }    
}
