package assinment;

import java.util.Scanner;

public class calculeter {
public static void main(String[] args) {
	 Scanner sc=new Scanner (System.in);
     while(true){
     char ch=sc.next().charAt(0);
         if(ch=='+'){
             int a=sc.nextInt();
             int b=sc.nextInt();
             System.out.println(a+b);
         }
         else if(ch=='-'){
             int a=sc.nextInt();
             int b=sc.nextInt();
             System.out.println(a-b);
         }
         else if(ch=='*'){
             int a=sc.nextInt();
             int b=sc.nextInt();
             System.out.println(a*b);
         }
         else if(ch=='/'){
             int a=sc.nextInt();
             int b=sc.nextInt();
             System.out.println(a/b);
         }
         else if(ch=='%'){
             int a=sc.nextInt();
             int b=sc.nextInt();
             System.out.println(a%b);
         }
         else if(ch=='x'||ch=='X'){
             break;
         }
         else{
             System.out.println("Invalid operation. Try again.");
         }
     }
}
}
