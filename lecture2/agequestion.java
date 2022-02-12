package lecture2;
import java.util.*;
public class agequestion {
public static void main(String[] args) {
	
	Scanner name = new Scanner(System.in);
	int marks = name.nextInt();
	if (marks > 70) {
	System.out.println("A");
	 if (marks <=70 && marks >60)
		 System.out.println("B");
	 else if (marks <=60 && marks > 50 )
		System.out.println("c");
	 else if (marks <= 50 && marks > 40)
		System.out.println("D");
	}
	else {
		System.out.println("fail");
		
	}
}
}
