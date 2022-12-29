package assinment;
import java.lang.Math; 
import java.util.Scanner;

public class calculater {
public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    char ch = scn.next().charAt(0);
   int  num1 = scn.nextInt(); 
    int num2 = scn.nextInt(); 
    int ans = 0;
    int  ans1 = 0;
    
    int ans2 = 0;
    int ans3 = 0;
    int ans4 = 0;
   
    
   while(true) {
	   
	   if(ch == '+'|| ch== '-' || ch=='*'|| ch=='/' || ch == '%') {
		   
		   
	   }if(ch=='+') {
		  ans = num1 + num2 ;
	   }if(ch=='-') {
		   ans1 = num1 - num2;
		   
	   }if(ch=='*') {
		  ans2= num1 *num2;
		   
	   }if(ch=='/') {
		   ans = num1/ num2;
	   }if(ch=='%') {
		   ans = num1 % num2;   
	   }else if(ch== ';'|| ch =='X') {
		   break;
		   
	   
	   }
	   System.out.println(ans);
	   break;
	   
   }
  
}

}
