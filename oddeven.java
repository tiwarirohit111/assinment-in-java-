package assinment;

import java.util.Scanner;

public class oddeven {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		
		int carNum ;
		int rem1;
		
		
		for(int i = 1;i<=n;i++)
		{
			carNum = scan.nextInt();
	 		int sumOdd =0;
		    int sumEven =0;
		    while(carNum!=0){
			
			rem1 = carNum %10;
			if(rem1 %2 !=0)
			{
				sumOdd =sumOdd +rem1;
				
			}
			else if(rem1%2==0)
			{
				sumEven =sumEven + rem1;
			}
			carNum/=10;
		    }
		
		
		if(sumOdd %3==0 || sumEven%4 ==0)
		{
			System.out.println("ans");
		}
		else 
		{
			System.out.println("sumeven");
		}
		}
	}
}