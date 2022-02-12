package lecture2;
import java.util.*;
public class questionadult {
public static void main(String[] args) {
	
	Scanner name = new Scanner(System.in);
	int n = name.nextInt();
	int count = 0;
	while (n>0) {
		n=n/10;
		count = count +1;
	}
		
		System.out.println( count);
		
	
}
}
