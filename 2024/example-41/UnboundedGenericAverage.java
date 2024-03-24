class UnboundedGeneric<T> {
    T[] arr;
    UnboundedGeneric(T[] arr) {
        this.arr = arr;
    }

    Double average() {
        Double sum = 0.0;
        
        for(T e : arr)
            sum += (Double) e;

        return sum / arr.length;
    }
}

class UnboundedGenericAverageDemo {
    public static void main(String[] args) {
        Integer[] i = {10,20,30,40};
        Double[] b = {10.2, 10.3, 10.5};
        String[] s = {"abrar", "ajaz", "wani"};
        UnboundedGeneric<Integer> ob1 = new UnboundedGeneric<Integer>(i);
        UnboundedGeneric<Double> ob2 = new UnboundedGeneric<Double>(b);
        UnboundedGeneric<String> ob3 = new UnboundedGeneric<String>(s);
        System.out.println("Average of ob1: " + ob1.average());
        System.out.println("Average of ob2: " + ob2.average());
        System.out.println("Average of ob3: " + ob3.average());
    }
}