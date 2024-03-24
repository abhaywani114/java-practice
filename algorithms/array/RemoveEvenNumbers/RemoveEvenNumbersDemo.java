class RemoveEvenNumbers {
    int[] arr;
    int[] filteredArray;
    RemoveEvenNumbers(int[] arr) {
        this.arr = arr;
        this.filteredArray = new int[this.countEvenNumbers()];
        this.processArray();
    }
    int countEvenNumbers() {
        int count = 0;
        for(int i : arr)
            if( i % 2 != 0) count++;
        return count;
    }
    void processArray() {
        int count = 0;
        for(int i : arr)
            if( i % 2 != 0) this.filteredArray[count++] = i;
    }

    void printArray(String msg, int[] arr) {
        System.out.println(msg);
        for(int i : arr)
            System.out.print(i + " " );
        System.out.println();
    }
    int[] reverseArray() {
        int[] result = new int[arr.length];
        int i = 0, j = arr.length - 1;
        while (j >= 0)
            result[j--] = arr[i++];
        return result;
    }
    void inPlaceReverse() {
        int i = 0, j = arr.length - 1;
        int temp;
        while(i < j) {
            temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }    
}
public class RemoveEvenNumbersDemo {
    public static void main(String[] args) {
        int[] arr = {10,2,3,4,4,5,2,1};
        RemoveEvenNumbers e1 = new RemoveEvenNumbers(arr);
        e1.printArray("Unfiltered array", e1.arr);
        e1.printArray("Filtered array", e1.filteredArray);
        e1.printArray("Reverse array", e1.reverseArray());
        e1.inPlaceReverse();
        e1.printArray("Unfiltered (reversed) array", e1.arr);
    }    
}