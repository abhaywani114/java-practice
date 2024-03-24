class BoundedGeneric<T extends Number> {
    T[] arr;
    BoundedGeneric(T[] arr) {
        this.arr = arr;
    }

    double average() {
        double sum = 0.0;
        
        for(T e : arr)
            sum += e.doubleValue();

        return sum / arr.length;
    }
}

class BoundedGenericAverageDemo {
    public static void main(String[] args) {
        Integer[] i = {10,20,30,40};
        Double[] b = {10.2, 10.3, 10.5};
        String[] s = {"abrar", "ajaz", "wani"};
        BoundedGeneric<Integer> ob1 = new BoundedGeneric<Integer>(i);
        BoundedGeneric<Double> ob2 = new BoundedGeneric<Double>(b);
        // BoundedGeneric<String> ob3 = new BoundedGeneric<String>(s);
        System.out.println("Average of ob1: " + ob1.average());
        System.out.println("Average of ob2: " + ob2.average());
        // System.out.println("Average of ob3: " + ob3.average());
    }
}