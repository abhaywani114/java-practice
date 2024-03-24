class AverageArray {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7};
        int average = 0;
        for (int i = 0; i < 7; i++) {
            average += myArray[i];
        }
        System.out.println("The average of array is: " + (average/7));
    }
}