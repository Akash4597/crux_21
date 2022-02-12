package lecture5;

public class inverse_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 32145;
		int ans = 0;
		int place = 1;
		while (n > 0) {
			int rem = n % 10;
			ans = (int) (ans + place * Math.pow(10, rem - 1));
			n /= 10;
			place++;

		}
		System.out.println(ans);

	}

}
                                                                                                                                                         