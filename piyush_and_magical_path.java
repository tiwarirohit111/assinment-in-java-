package assinment;

import java.util.Scanner;

public class piyush_and_magical_path {
    public static void main(String args[]) {
        // Your Code Here
         Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int k=sc.nextInt();
		    int s=sc.nextInt();
		    char arr[][]=new char[n][m];
		    for(int i=0;i<n;i++){
		        for(int j=0;j<m;j++){
		            arr[i][j]=sc.next().charAt(0);
		        }
		    }
		    
		    for(int i=0;i<n;i++){
		        for(int j=0;j<m;j++){
		            if(s<k)
						break;
		            if(j!=m-1)
		                s--;
		            if(arr[i][j]=='.')
		                s=s-2;
		           else if(arr[i][j]=='*')
		                s=s+5;
		           else if(arr[i][j]=='#'){
		                s=s+1;
		                break;
		           }
		        }
		    }
			if(s>=k){
				System.out.println("Yes");
						System.out.println(s);


			}
			else
				System.out.println("No");
  
}
}