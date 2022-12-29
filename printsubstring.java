package assinment;

import java.util.Scanner;

public class printsubstring {
	public static void tiwari(String str ,int n , int m) {
		String substr  = str.substring(n, m);
		System.out.println(substr);
	}
public static void main(String[] args) {
	Scanner  scn = new Scanner(System.in);
	String str  = scn.nextLine();
	int n = scn.nextInt();
	int m = scn.nextInt();
	
	tiwari(str,n,m);
	
}
}
