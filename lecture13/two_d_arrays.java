package lecture13;

import java.util.Scanner;

public class two_d_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		int row= sc.nextInt();
		int col= sc.nextInt();
		int [] [] arr= new int [row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				 arr[i][j]= sc.nextInt();
				
			}
		}
			
			
			display(arr);
		}
		public static void display(int [] [] arr) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.println(arr[i][j]+" ");
					
				}
			}
			System.out.println();
			
		}
		

	}


