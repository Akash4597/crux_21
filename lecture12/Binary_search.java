package lecture12;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,5,7,11,13,14,15,16};
		int item = 13;
		System.out.println(binarysearch(arr, item));
		

	}
	public static int binarysearch(int[] arr, int  item) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			
			int mid = (lo+hi)/2;
			
			if (arr[mid] == item) {
				return mid;
			}
			else if (arr[mid]<item) {
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return -1;
		
	}

}
