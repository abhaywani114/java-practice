class SecondMax2 {
    public static int secondMax(int[] arr) {
        int max  = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                secondMax = max;
                max = i;
            } else if ( i < max && i > secondMax) {
                secondMax = i;
            }
        }
        return secondMax;
    }

    public static void main(String[] main) {
        int[] arr = {11,10,2,3,4,5,7,2,1,4};
        System.out.println("Second max is: " + secondMax(arr));
    }
}
