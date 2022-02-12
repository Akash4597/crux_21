package lecture11;

public class Maxsubbarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, -19, 11, -17, 4 };
		int sub2 = subarray(arr);
		System.out.println(sub2);

	}

	public static int subarray(int[] arr) {
		int maxsum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					// System.out.print(arr[k]+" ");
					sum += arr[k];

				}
				maxsum = Math.max(maxsum, sum);

			}

		}
		return maxsum;
	}

}
