class TimeComplex {
    int num;
    TimeComplex(int num) {
        this.num = num;
    }
    int method1()  {
        int sum = 0;
        for (int i = 1; i <= num; i++ )
            sum += i;
        return sum;
    }

    int method2() {
        return (num * (num + 1)) / 2;
    }
}

class TimeComplexDemo {
    public static void main(String[] args) {
        TimeComplex t1 = new TimeComplex(9999);

        long now = System.currentTimeMillis();
        System.out.println("Result using method 1: " + t1.method1());
        System.out.println("Time taken using method1: " + (System.currentTimeMillis() - now));

        now = System.currentTimeMillis();
        System.out.println("Result using method 2: " + t1.method2());
        System.out.println("Time taken using method2: " + (System.currentTimeMillis() - now));

    }
}