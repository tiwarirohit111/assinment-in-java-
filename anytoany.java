package assinment;

import java.util.Scanner;

public class anytoany {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	int sb = scn.nextInt();
	int db = scn.nextInt();
	int num1 = scn.nextInt();
	
	conversion(num1, sb, db);
	System.out.println(conversion(num1, sb, db));

}

	public static int conversion(int num1, int sb, int db){
		
	        int ans = 0;
	        int mult = 1;
	        while(num1 != 0){
	            int rem = num1 % 10;
	            ans  = ans + rem * mult;
	            mult = mult * sb;
	            num1 = num1 / 10;
	        }

	        mult = 1;
	        num1 = ans;
	        ans = 0;
	        while(num1 != 0){
	             int rem = num1 % db;
	            ans  = ans + rem * mult;
	            mult = mult * 10;
	            num1 = num1 / db;    
	        }  
	        return ans;  
	    
	}
}
