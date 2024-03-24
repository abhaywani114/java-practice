class Move0ToStart {
	public static void move0(Integer[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while ( i < j) {
			if (arr[j] != 0) j--;
			else {
				arr[j] = arr[i];
				arr[i++] = 0;
			}
		}
	}

	public static void main(String[] argv) {
		Integer arr[] = {1,2,3,0,4,0,5,0,0,6};
		move0(arr);
		for(int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}
}
