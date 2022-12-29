package assinment;

import java.util.Scanner;

public class checkprimeno {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		  int count = 1;

		  for (int i = 1; i <= n; i++) {
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   }

		  
		}
		
	}

}
