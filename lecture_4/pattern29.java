package lecture_4;

public class pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		int val = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				if(cst==1 || cst==nst) {
				System.out.print(row+"\t");
		
			}
				else {
					System.out.print(0+"\t");
				}
				cst++;
			}
			System.out.println();
			nsp--;
			row++;
			nst += 2;
		}

	}

}
