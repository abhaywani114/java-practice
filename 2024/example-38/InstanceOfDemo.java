class A {
    int a = 0;
}
class B {
    int b = 2;
}

class C extends A {
    int c = 3;
}

class D extends B {
    int d = 3;
}

class E extends C {
    int e = 0;
}

class F extends A {
    int f = 0;
}
public class InstanceOfDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();

        System.out.println("Is a instance of A: " + (a instanceof A));
        System.out.println("Is a instance of E: " + (a instanceof E));
        System.out.println("Is a instance of F: " + (a instanceof F));
        System.out.println("Is e instance of A: " + (e instanceof A));
        System.out.println("Is f instance of A: " + (f instanceof A));
    }    
}