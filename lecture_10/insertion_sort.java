package lecture_10;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,6,4,9,3,1};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			
		
		System.out.print(arr[i]+" ");
		}

	}
	public static void sort(int[]arr) {
		for (int counter = 0; counter < arr.length; counter++) {
			int j=counter-1;
			int item=arr[counter];
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
			
		}
	}

}
