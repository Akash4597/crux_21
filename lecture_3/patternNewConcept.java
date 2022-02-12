package lecture_3;
import java.util.*;
public class patternNewConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner sc= new Scanner (System.in);
     int n = sc.nextInt();
     
     int row=1;
     int nst=1; // no of star
     while(row <= 2*n-1) {
  	   
  	   int cst=1; // count of star
  	   while(cst<=nst) {
  		   System.out.print("* ");
  		   cst++;  
  	   }
  	   if (row<n) {
  		   nst++;
  	   }
  	   else {
  		   nst--;
  	   }
  	   
  	   //next row prep
  	   System.out.println();
  	   row++;
  	  // nst++;
		
		
     }
		
		
	}

}
