package assinment;

public class recursion1 {
	public static void tiwari(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		tiwari(n - 1);
		System.out.println(n);	
		
	}
public static void main(String args[]) {
	tiwari(6);
	
}
}
