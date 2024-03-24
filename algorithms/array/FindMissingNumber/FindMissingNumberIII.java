import java.util.Arrays;
class FindMissingNumberIII {
	public static int findMisssingNumber(int[] arr) {
		int minNumber = Arrays.stream(arr).min().getAsInt();
		int maxNumber = Arrays.stream(arr).max().getAsInt();
		int diff  = maxNumber  - minNumber; 
		int sum = ((diff * (2 *minNumber + diff +1)) / 2);
		int arraySum = 0;
		for(int i : arr) arraySum += i;
		int missingNumber = (sum - arraySum) + minNumber;
		return missingNumber;
	}
	public static void main(String[] argv) {
		int[] arr = {71,76,75,73,74,72,78};
		System.out.println("Missing number is: " + findMisssingNumber(arr));
	}
}
