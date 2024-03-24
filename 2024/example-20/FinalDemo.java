class A {
    final void print() {
        System.out.println("Hello");
    }
}

final class B extends A {

    // void print(){} cann't be overridden

    void print2() {
        System.out.println("Hey");
    }
}

// class C extends B {} // can't extend B 

class FinalDemo {
    public static void main(String[] args) {
        B b = new B();
        b.print();
        b.print2();
    }    
}
