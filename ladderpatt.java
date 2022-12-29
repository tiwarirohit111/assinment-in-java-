package assinment;

import java.util.Scanner;

public class ladderpatt {
public static void main(String[] args) {  
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int i, j, k = 1; 
	for (i = 1; i <= n; i++)   
	{  
	for (j = 1; j< i + 1; j++)   
	{  
	System.out.print(k++ + "\t ");  
	}  
	System.out.println();  
	}  
}
}
