package assinment;

import java.util.Scanner;

public class primefactorization {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int num = scn.nextInt();
     for(int i = 2; i< num; i++) {
        while(num%i == 0) {
           System.out.print(i+" ");
           num = num/i;
        }
     }
     if(num >2) {
        System.out.println(num);
     }
	
}
}
