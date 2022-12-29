package assinment;

import java.util.Scanner;

public class uniqueprime {
	public static void main(String[] args) {
		
	
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int i = 2;
while(i < n) {
	n = n/i;
	while(n %i ==0) {
		System.out.print(i+" ");
		}
	if(n > 2) {
		System.out.println(n);
	}
	i++;	
}
}
}
