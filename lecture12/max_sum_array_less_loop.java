package lecture12;

public class max_sum_array_less_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, -19, 11, -17, 4 };
		int sub2 = subarray2(arr);
		System.out.println(sub2);

	}

	public static int subarray2(int[] arr) {
		int maxsum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {

				// for (int k = i; k <= j; k++) {
				// System.out.print(arr[k]+" ");
				sum += arr[j];

				maxsum = Math.max(maxsum, sum);

			}
		}

		return maxsum;
	}

}
