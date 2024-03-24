import java.util.Arrays;

class FindDuplicateNumberI {
	public static int findDuplicate(int[] arr) {
		int minNo = Arrays.stream(arr).min().getAsInt();
		int maxNo = Arrays.stream(arr).max().getAsInt();
		int diff = maxNo - minNo;
		int sum = ((diff * (2 *minNo + diff +1)) / 2);
		int arraySum = 0;
		for (int i:arr) arraySum += i;
		int duplicateNo = (arraySum - sum) - minNo;
		return duplicateNo;
	}

	public static void main(String[] argv) {
		int[] arr = {67,60,65,66,62,63,61,64,67};
		System.out.println("Duplicate no: " + findDuplicate(arr));
	}
}
