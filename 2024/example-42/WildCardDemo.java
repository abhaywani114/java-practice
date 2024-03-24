class WildCard<T extends Number> {
    T obj[];
    WildCard(T[] obj) {
        this.obj = obj;
    }

    double  getAvg() {
        double sum = 0.0;
        for(T e : obj)
            sum += e.doubleValue();

        return sum / obj.length;
    }

    boolean isAvgSame(WildCard<?> obj1) {
        return getAvg() == obj1.getAvg();
    }
}

class WildCardDemo {
    public static void main(String[] args) {
        Integer[] i = {1,2,3,4};
        Double[] d = {1.0,2.0,3.0,4.0};
        Double[] d2 = {1.0,2.0,3.0,4.0,5.65};

        WildCard<Integer> obj1 = new WildCard<Integer>(i);
        WildCard<Double> obj2 = new WildCard<Double>(d);
        WildCard<Double> obj3 = new WildCard<Double>(d2);

        System.out.println("Is avg of obj1 and obj2 same: " + obj1.isAvgSame(obj2));
        System.out.println("Is avg of obj1 and obj3 same: " + obj1.isAvgSame(obj3));

    }
}