package lecture_4;

public class pattern_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			int val = 1;
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val + "\t");
				val++;
				cst++;
			}
			System.out.println();
			nsp--;
			row++;
			nst += 2;
		}

	}

}

