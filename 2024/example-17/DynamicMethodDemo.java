class A {
    void print() {
        System.out.println("Print in class A");
    }    
}

class B extends A {
    void print() {
        System.out.println("Print in class B");
    }
}

class C extends A {
    void print() {
        System.out.println("Print in class C");
    }
}

class DynamicMethodDemo {
    public static void main(String[] args) {
        A r, a = new A();
        B b = new B();
        C c = new C();
        r = a;
        r.print();

        r = b;
        r.print();

        r = c;
        r.print();
    }
}
