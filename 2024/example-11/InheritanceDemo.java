class A {
    int i, j;
    void showij() {
        System.out.printf("i = %d, j = %d\n",i, j);
    }
}

class B extends A {
    int k;
    void showk() {
        System.out.println("k= " + k);
    }
    void sum() {
        System.out.println("Sum of all numbers is " + (i + j + k));
    }
}
class InheritanceDemo {
    public static void main(String[] args) {
        A superClass = new A();
        B subClass = new B();

        System.out.println("Super class");
        superClass.i = 10;
        superClass.j = 20;
        superClass.showij();
        
        System.out.println("Sub class");
        subClass.i = 1;
        subClass.j = 2;
        subClass.k = 3;
        subClass.showij();
        subClass.sum();

    }   
}
