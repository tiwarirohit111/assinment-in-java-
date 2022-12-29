package assinment;

import java.util.Scanner;
//galt h
public class game {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		int i = 1;
		while(i >0 ) {
			int m  = scn.nextInt();
			int n= scn.nextInt();
			if(m < 0 ) {
				System.out.println("Ayush");
				break;
				
			}
			if(n <0) {
				System.out.println("Harshit");
				
			}
			i++;
			
		}
		t--;
	}
	
}
