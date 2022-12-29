package assinment;

import java.util.Scanner;

public class oddpleaceandevenplacedigit {
	 Scanner sc=new Scanner(System.in);
     int n = sc.nextInt();
     int position = 1;
		int oddsum = 0;
		int evensum = 0;
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			if (position % 2 == 1) {
				oddsum = oddsum + digit;
			} else {
				evensum = evensum + digit;
			}
				position++;
		}
		System.out.println(oddsum);
		System.out.println(evensum);

	}
}
	
