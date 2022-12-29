package assinment;

import java.util.Scanner;

public class reversenum {
public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);
	int num = scn.nextInt();
	
	int  reverse = 0;  
	while(num != 0)   
	{  
	int remainder = num % 10;  
	reverse = reverse * 10 + remainder;  
	num = num/10;  
	
	}  
	System.out.println( reverse);  
}
}
