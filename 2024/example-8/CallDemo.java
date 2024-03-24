class call {
    double value1;
    double value2;
    void print() {
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
    }
}

class CallDemo {
    static void op(call c) {
        c.value1 *= 100;
        c.value2 /= 100;
    } 
    public static void main(String[] args) {
        call c1 = new call();
        c1.value1 = 23;
        c1.value2 = 41;
        c1.print();
        System.out.println("After operation");
        op(c1);
        c1.print();
    }
}
