package assinment;

import java.util.Scanner;

public class makenumbertable {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	  int n = scn.nextInt();
	   
	int ans = 0;
	while(n != 0) {
		 for(int num = 0; num <=n;num++) {
		       num = scn.nextInt();
			    }
		int digit = n % 10;
		ans = ans *10 + digit;
		n = n/10;
		
	}
	System.out.println(ans);
	
}
}
