import java.util.Scanner;

class singleOccurance {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter array size:");
      
      int size = keyboard.nextInt();
      int[] myArray = new int[size];

      System.out.println("Enter elements into the array");
      for(int i = 0; i < myArray.length; i++)
        myArray[i] = keyboard.nextInt();
    
      int maxElement = findMax(myArray);
      int[] trackArray = new int[maxElement + 1 ];
      int numberOfUniqueElements = 0;
      for(int element:myArray){
        trackArray[element]++;
        if (trackArray[element] == 1)
            numberOfUniqueElements++;
      }

      int[] resultArray = new int[numberOfUniqueElements];
      int j = 0;
      for(int i = 0; i < trackArray.length; i++) {
        if (trackArray[i] > 0)
            resultArray[j++]  = i;
      }

      System.out.println("Unique element array is:");
      for(int element:resultArray)
        System.out.print(element + "\t");
      
      System.out.println();
    }

    public static int findMax(int[] arr) {
        if (arr.length < 1) return 0;
        int maxNumber = arr[0];
        for(int element:arr){
            if (element > maxNumber) {
                maxNumber = element;
            }
        }              
        return maxNumber;
    }
}