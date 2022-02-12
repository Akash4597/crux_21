package lecture11;

public class max_sub_array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, -19, 11, -17, 4 };
		subarray(arr);

	}

	public static void subarray(int [] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i; j < arr.length; j++) {
				for (int k =i ; k <= j; k++) {
					System.out.print(arr[k]+" ");
					
				}
				System.out.println();
				
			}
			
		}
	}

}
