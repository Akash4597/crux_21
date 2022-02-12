package lecture9;

import java.util.Iterator;

public class reversal_algo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7,8};
		rotatearray(nums,3);
		//System.out.println(arr[i]+" ");
		
		System.out.println();

	}
	public static void rotatearray(int[] nums, int k) {

	    int n = nums.length;
	    k = k%n;
	    reverseinrange(nums, 0 ,n-1);
	    reverseinrange(nums, 0 ,k-1);
	    reverseinrange(nums, k ,n-1);
	}

	public static void reverseinrange(int[] a, int i, int j){
	    while(i < j)
	    {
	        int t = a[i];
	        a[i] = a[j];
	        a[j] = t;
	        i++;
	        j--;
	    }
	}

}
