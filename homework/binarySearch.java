import java.util.Scanner;
class binarySearch {
    public static void main(String[] argv) {
        Scanner keyboard = new Scanner(System.in);
    
        System.out.println("Enter array size:");
        int size = keyboard.nextInt();
        
        int[] myArray = new int[size];
        System.out.println("Enter elements for array");
        for(int i = 0 ; i < size; i++){
              myArray[i] = keyboard.nextInt();
        }
        
        System.out.println("Enter a number to check if it is in array:");
        int key = keyboard.nextInt();
        System.out.println("If " + key + " is in array: " + search(myArray, key, 0, myArray.length - 1));
    }
    public static boolean search(int[] array, int key, int start, int end) {
        if (start > end) return false;
        int mid =  (start + end) / 2;
        if (array[mid] == key)
            return true;
        else if (array[mid] > key)
            return search(array, key, start, mid - 1 );
        else if (array[mid] < key)
            return search(array, key, mid + 1, end);
    
        return false;
    }
}
