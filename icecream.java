package assinment;

import java.util.Scanner;

public class icecream {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int [] arr = new int[size];
	while(size != 0) {
		for(int i = 0; i< arr.length;i++) {
			arr[i] = scn.nextInt();
			size--;
			
		}
	}
	int jeb = arr[0];
	for(int i= 0; i< arr.length; i++) {
		if(jeb > arr[i]) {
			jeb = arr[i];
			
		}
	}
	for (int i = 0; i< arr.length;i++) {
		if (arr[i]== jeb) {
			System.out.println(i+1);
			
		}
		
	}
}
}
