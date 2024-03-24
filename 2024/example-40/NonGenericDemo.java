class NonGeneric {
    Object ob;
    NonGeneric(Object ob) {
        this.ob = ob;
    }
    String getType() {
        return ob.getClass().getName();
    }
    Object getObject() {
        return ob;
    }
}

class NonGenericDemo {
    public static void main(String[] args) {
        NonGeneric ob1 = new NonGeneric(10);
        NonGeneric ob2 = new NonGeneric("Hello mohsin");
        System.out.println("Ob1 type: " + ob1.getType());
        System.out.println("Ob1 value: " + ob1.getObject());
        System.out.println();
        System.out.println("Ob2 type: " + ob2.getType());
        System.out.println("Ob2 value: " + ob2.getObject());
        System.out.println();
        ob1 = ob2;
        System.out.println("Ob1 type: " + ob1.getType());
        System.out.println("Ob1 value: " + (int) ob1.getObject());
    }
}