package assinment;

import java.util.Scanner;

public class caculatesum {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int arr[] = new int[n];
	int sum = 0;
	for(int i = 0; i< arr.length;i++) {
		arr[i] = scn.nextInt();
		sum = sum +arr[i];
		
	}
	int q = scn.nextInt();
	int open = 1;
	while(open <= q) {
		int x = scn.nextInt();
		sum = sum*2;
		open++;
		
	}
	int pow = (int)Math.pow(10, 9) + 7;
	sum = sum %pow;
	System.out.println(sum);
			}
}
