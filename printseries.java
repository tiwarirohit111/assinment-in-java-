package assinment;

import java.util.Scanner;

public class printseries {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int num1 = scn.nextInt();
	int num2 = scn.nextInt();
	int count = 0;
	int i = 1;
	
	while( count< num1) {
		int series =(3*i)+2;
		if(series % num2  != 0) {
			System.out.println(series);
			count++;
			
			
		}
		i++;
		
		
	}
	
	
}
}
