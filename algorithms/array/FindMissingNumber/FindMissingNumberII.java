import java.util.Arrays;

class FindMissingNumberII {
	public static int findMissingNumber(int[] arr) {
		int maxNumber = Arrays.stream(arr).max().getAsInt();
		int sum = (maxNumber * (maxNumber + 1)) / 2;
		int arraySum = 0;
		for(int i:arr)
			arraySum += i;
		int missingNumber = sum - arraySum;
		return missingNumber;
	}
	public static void main(String[] argv) {
		int arr[] = {1,2,5,4,8,6,3};
		System.out.println("Missing number is: " + findMissingNumber(arr));
	}
}
