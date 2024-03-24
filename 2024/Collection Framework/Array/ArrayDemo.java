import java.util.Arrays;
import java.util.List;

class ArrayDemo {
	public static void main(String[] argv) {
		Integer arr[] = {1,2,40,22,33,51,3,9};

		Arrays.sort(arr, 0, arr.length);
		List<Integer> l1 = Arrays.asList(arr);
		System.out.println("Sorted array: " + l1);

		System.out.println("Binary search 10: " + Arrays.binarySearch(arr, 10));
		System.out.println("Binary search 9: " + Arrays.binarySearch(arr, 9));
	}
}
