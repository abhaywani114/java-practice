class FindDuplicateNumberIII {
	public static int floydCycleFind(int[] arr) {
		int slow = arr[0];
		int fast = arr[0];
		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
		} while (fast < arr.length && slow != fast);

		slow = arr[0];
		while (slow !=  fast) {
			slow = arr[slow];
			fast = arr[fast];
		}

		return slow;
	}
	public static void main(String[] argv) {
		int arr[] = {3,1,3,4,2,3,2,2};
		System.out.println("Duplicate number is: " + floydCycleFind(arr));
	}

}
