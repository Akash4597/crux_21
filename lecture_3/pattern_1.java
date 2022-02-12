package lecture_3;

import java.util.Scanner;

public class pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       int row=1;
       int nst=1; // no of star
       while(row<=n) {
    	   
    	   int cst=1; // count of star
    	   while(cst<=nst) {
    		   System.out.print("* ");
    		   cst++;    		   
    	   }
    	   
    	   //next row prep
    	   System.out.println();
    	   row++;
    	   nst++;
       }
		
		
	}

}
