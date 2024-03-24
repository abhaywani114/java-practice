class MoveToEnd {
	public static void move(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
					arr[j] = arr[i];
					arr[i] = 0;
			}

			if (arr[j] != 0)
				j++;
		}
	}
	public static void main(String[] argv) {
		int arr[] = {0,1,2,0,3,4,0,5,0,6,0};
		move(arr);
		for( int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}
}
