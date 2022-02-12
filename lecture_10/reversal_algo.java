package lecture_10;

public class reversal_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static void Rotatearray(int[ ]arr, int k) {
		int n=arr.length;
		k=k%n;
}
	public static void reverse(int[] a, int i, int j){
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
