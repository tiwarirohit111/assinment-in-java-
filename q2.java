package assinment;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int n = 244135;
		int ans = 0;
		int mult = 1;
		while(n > 0) {
			int digit = n % 10;
			n = n / 10;
			ans = ans + digit * mult;
			mult = mult * 10;
		}
		System.out.println(ans);
	}

}
