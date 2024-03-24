class A {
    int  i; 
    int getI() {
        return i;
    }
}

class B extends A{
    int i;
    B(int a, int b) {
        this.i  = a;
        super.i = b;
    }

    void print() {
        System.out.println("this.i = " + i);
        System.out.println("super.i = " + super.i);
        System.out.println("getI() = " + getI());
    }
} 

public class SuperMemberDemo {
    public static void main(String[] args) {
        B b = new B(10, 12);
        b.print();       
    }
}
