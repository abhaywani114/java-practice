import java.util.Scanner;
public class quickSort {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    
        System.out.println("Enter array size:");
        int size = keyboard.nextInt();
        
        int[] myArray = new int[size];
        System.out.println("Enter elements for array");
        for(int i = 0 ; i < size; i++){
              myArray[i] = keyboard.nextInt();
        }
        
        sort(myArray, 0, myArray.length - 1);
        printArray(myArray);
    }   
    public static int partition(int[] myArray, int start, int end) {
        int pivot = myArray[end];
        int pIndex = start;
        for(int i  = start; i < end; i++) {
            if (myArray[i] <= pivot) {
                swap(myArray, i, pIndex);
                pIndex++;
            }
        }
        swap(myArray, pIndex, end);
        return pIndex;
    }
    public static void swap(int[] myArray, int index_1, int index_2) {
        int temp = myArray[index_1];
        myArray[index_1] = myArray[index_2];        
        myArray[index_2] = temp;
    }
    public static void sort(int[] myArray, int start, int end) {
        if (start >= end) return;
        int index  = partition(myArray, start, end);
        sort(myArray,start, index - 1);
        sort(myArray,index + 1, end);
    }

    public static void printArray(int[] myArray) {
        for(int element:myArray)
            System.out.print(element + "\t");
        System.out.println();
    }

}
