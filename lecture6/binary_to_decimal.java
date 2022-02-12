package lecture6;

import java.util.Scanner;

public class binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// int n=1000011;
		// dis=10;
		// souce=2;
		int ans = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 10;
			ans = ans + rem * mul;
			n /= 10;
			mul = mul * 2;
		}
		System.out.println(ans);

	}

}
