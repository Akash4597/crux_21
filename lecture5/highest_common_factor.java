package lecture5;

import java.util.Scanner;

public class highest_common_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int divisor = 36;
		int divident = 60;
		int rem = 0;
		while (divident % divisor > 0) {
			rem = divident % divisor;
			divident = divisor;
			divisor = rem;

		}
		System.out.println(divisor);
	}

}
