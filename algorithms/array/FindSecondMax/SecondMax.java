public class SecondMax {
    public static int findSecondMax(int[] arr ) {
        int max = arr[0];
        int secondMax = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
            } else if (max > arr[i] && secondMax < arr[i])
                secondMax = arr[i];
        }

        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9,5,6,7,8,10};
        System.out.println("Second max: " + findSecondMax(arr));
    }
    
}