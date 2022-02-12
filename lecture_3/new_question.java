package lecture_3;
import java.util.*;
public class new_question {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	
		int row=1;
		int nst=1;
		int nsp=n-1;
		
		while (row<=n) {
			
		//space
			int csp=1;
			while (csp<=nsp) {
				System.out.print("  ");
				csp++;
				
			}
			
			int cst= 1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
		}
		
		System.out.println();
		nsp--;
		nst++;
		row++;
		
		
		
	}
	}
}

