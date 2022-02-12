package lecture8;

import java.util.Scanner;

public class count_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count= countofdigit(n);
		System.out.println(count);
	}

	public static int countofdigit(int n) {
		int count = 0;
		while (n > 0) {
			count ++;
			n = n / 10;
		}
		return count;
	}
	
			
			
	}
	

