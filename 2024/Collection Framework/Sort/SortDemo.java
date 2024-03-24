import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Comparator;

class numberComparable  implements Comparator<Integer> {
	public int compare(Integer a, Integer b) {
			return a - b;
	}
}

class SortDemo {
	public static void main(String[] argv) {
		Scanner keyboard = new Scanner(System.in);
		LinkedList<Integer> myList = new LinkedList<Integer>();

		int input;
		System.out.println("Enter numbers to populate linkedlist");
		while ((input = keyboard.nextInt()) != -1) {
				myList.add(input);
		}

		System.out.println("Unsorted linkedlist: " + myList);

		Collections.sort(myList, new numberComparable());
		System.out.println("Sorted list: " + myList);

		Collections.reverse(myList);
		System.out.println("Reversed Sorted list: " + myList);


		Comparator<Integer> comp2 = Comparator.reverseOrder();
		Collections.sort(myList, comp2);
		System.out.println("Resorted list: " + myList);

		Integer maxNumber =  Collections.max(myList, new numberComparable());
		System.out.println("Max Numbe in linkedlist is: " + maxNumber);

	}
}
