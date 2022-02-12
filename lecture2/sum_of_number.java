package lecture2;
import java.util.*;

public class sum_of_number {
	public static void main(String[] args) {
 Scanner name = new Scanner(System.in);
 int n = name.nextInt();
int i=1;
int sum =0;
while(i<=n) {
	
	sum= sum+i;
	i += 1;
}
System.out.println(sum);


}


}
