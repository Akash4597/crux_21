package lecture8;

public class any_to_any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sb = 5;
		int num = 21043;
		int db = 8;
		int newnum = any_to_10(sb, num);
		System.out.println(newnum);
		int numm=dec_to_any(db, newnum);
		System.out.println(numm);

	}

	public static int any_to_10(int sb, int num) {

		int ans=0;
		int mul=1;
		while(num>0) {
			int rem=num%10;
			ans=ans+rem*mul;
			num/=10;
			mul=mul*sb;
	}
		return ans;
	}
	public static int dec_to_any(int db, int newnum) {
		int ans=0;
		int mul=1;
		while(newnum>0) {
			int rem=newnum%db;
			ans=ans+rem*mul;
			newnum/=db;
			mul=mul*10;
			
		}
		return ans;
	}
}
