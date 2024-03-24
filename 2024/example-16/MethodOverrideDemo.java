class A {
    int i, j;
    A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void print() {
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}

class B extends A{
    int k;
    B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }
    void print() {
        // super.print();
        System.out.println("k: " + k);
    }
    void printX() {
        super.print();
        print();
    }
}

 class MethodOverrideDemo {
    public static void main(String[] args) {
        B  ob1 = new B(1,2,3);
        ob1.print();
        System.out.println();
        ob1.printX();
    }
}
