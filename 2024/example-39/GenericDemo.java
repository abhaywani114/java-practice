class Gen<T> {
    T ob;
    Gen(T ob) {
        this.ob = ob;
    }
    T getOb() {
        return ob;
    }
}
class GenericDemo {
    // @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Gen<String> ob = new Gen<String>("Hello");
        Gen<Double> d2   = new Gen<Double>(1.23);
        Gen<Integer> d3   = new Gen<Integer>(1);
        System.out.println("Print obj: " + ob.getOb());
        System.out.println("Print obj: " + d2.getOb());
        System.out.println("Print obj: " + d3.getOb());
    }
}