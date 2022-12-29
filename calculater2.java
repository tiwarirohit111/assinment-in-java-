package assinment;

import java.util.Scanner;

public class calculater2 {
public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	   
	    while(true ) {
	    	char ch = scn.next().charAt(0);
	 	   int  num1 = scn.nextInt(); 
	 	    int num2 = scn.nextInt();
	 	    int ans = 0;
	 	   if(ch == '+'|| ch== '-' || ch=='*'|| ch=='/' || ch == '%') {
			   
			   
		   }if(ch=='+') {
			  ans = num1 + num2 ;
			  
	    	 
	    }if(ch=='-') {
			   ans = num1 - num2;
			   
		   }if(ch=='*') {
			  ans= num1 *num2;
			   
		   }if(ch=='/') {
			   ans = num1/ num2;
		   }if(ch=='%') {
			   ans = num1 % num2;   
		   }else if(ch== ';'|| ch =='X') {
			   break;
		   }
		   
		   System.out.println(ans);
	    }
	   
	    }
	    }
