package lecture_3;

import java.util.*;

public class pattern_q2 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	int row = 1;
	int nst=2*n-1;
	while(row<=n){

		int cst = 1;
		while (cst <= nst) {
			System.out.print("* ");
			cst++;

		}

		System.out.println();
		row++;
		nst -= 2;
	}
}}
