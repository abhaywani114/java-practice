import java.util.*;
class Move0ToStartRelative {
	public static void move(Integer arr[]) {
		int i = arr.length - 1;
		int j = arr.length - 1;
		while (i >= 0 && j >= 0) {
			while(i > -1 && arr[i] != 0) i--;
			j = i;

			while(j > - 1 && arr[j] == 0) j--;
			if (j == -1) break;

			arr[i] = arr[j];
			arr[j] = 0;
		}
	}

	public static void main(String argv[]) {
			Integer arr[] = {0,1,2,0,0,3,0,4,0}, arr2[]  = {};
			move(arr);
			for(int  i : arr)
				System.out.print(i + " ");
			System.out.println();
	}
}
