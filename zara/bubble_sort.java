import java.util.Scanner;
class bubble_sort {
  public static void main(String[] argc) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter array size:");
    int size = keyboard.nextInt();
    
    int[] nums = new int[size];
    System.out.println("Enter elements for array");
    for(int i = 0 ; i < size; i++){
          nums[i] = keyboard.nextInt();
    }
    
    for(int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length - i - 1; j++) {
        if (nums[j] > nums[j+1]) {
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
        }
      }
    }

    System.out.println("Sorted array:");
    for(int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + "  ");
    } 
    System.out.println();
  }
}
