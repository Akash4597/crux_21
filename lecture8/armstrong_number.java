package lecture8;

import java.util.Iterator;
import java.util.Scanner;

public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
		printarmstrongnumber(400, 1000);
		// System.out.println(armstrongnumber(n));

	}

	public static void printarmstrongnumber(int n1, int n2) {
		for (int i = n1; i <= n2; i++) {
			if (armstrongnumber(i)) {
				System.out.println(i);
			}

		}
	}

	public static boolean armstrongnumber(int n) {

		int ans = 0;
		int count = countofdigit(n);
		int m = n;
		while (n > 0) {
			int rem = n % 10;
			ans = (int) (ans + Math.pow(rem, count));
			n = n / 10;
		}
		return m == ans;

	}

	public static int countofdigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

}
