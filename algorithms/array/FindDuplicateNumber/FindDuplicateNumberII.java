import java.util.Arrays;

class FindDuplicateII {
	public static int findDuplicate(int[] arr) {
		int minNo = Arrays.stream(arr).min().getAsInt();
		int maxNo = Arrays.stream(arr).max().getAsInt();
		int diff =  maxNo - minNo;
		int sum = ((diff * (2 * minNo + diff + 1)) / 2) + minNo;
		int arraySum = 0;
		for (int i : arr) arraySum += i;
		int duplicateNumber = (arraySum - sum) / (arr.length - diff - 1);
		return duplicateNumber;
	}

	public static void d(String s) {
		System.out.println(s);
	}

	public static void main(String[] argv) {
		int[] arr = {70,72,71,73,75,77,76,77,77,74};
		System.out.println("Duplicate number is: " + findDuplicate(arr));
	}
}
