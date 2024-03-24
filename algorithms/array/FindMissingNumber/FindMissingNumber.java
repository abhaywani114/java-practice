import java.util.*;
class FindMissingNumber {
	static int findN(int arr[]) {
		int missingNumber = Integer.MIN_VALUE;
		int max = Arrays.stream(arr).max().getAsInt();
		int bufferArray[] = new int[arr.length + 1];
		for (int i:arr) {
			bufferArray[max - i] = 1;
		}

		for (int i = 0; i < bufferArray.length; i++){
			if (bufferArray[i] == 0) {
				missingNumber = max - i;
				break;
			}
		}

		return missingNumber;
	}
	public static void main(String[] argv) {
		//int[] arr = {2,3,1,4,6,5,8};
		int[] arr = {52,50,51,56,53,54,55,58};
		System.out.println("Missing number in array is: " + findN(arr));
	}
}
