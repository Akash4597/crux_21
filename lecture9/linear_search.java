package lecture9;

import java.util.Iterator;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 3, 4, 2, 4, 55, 8, 9 };
		System.out.println(linearsearch(arr, 12));

	}

	public static int linearsearch(int[] arr, int item) {
		// item= Integer.MIN_VALUE;//-2^31
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {

				return i;
			}

		}
		return -1;
	}

}