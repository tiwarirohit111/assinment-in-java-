package assinment;

import java.util.Scanner;

public class vonneuman {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
	{
		 
		int bin = sc.nextInt();
        int dec = 0;
        int i= 1;

		while(bin!=0)
		{
			int remainder = bin%10;
			dec = dec + remainder*i;
			i=i*2;
			bin = bin/10;
		}
		System.out.print(dec);
	}
}
}