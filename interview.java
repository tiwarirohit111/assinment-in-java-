package assinment;

import java.util.Scanner;

public class interview {
	 static int isPrime(int num)
	  {
	 
	    
	    if (num <= 1)
	      return 0;
	    if (num == 2 || num == 3)
	      return 1;
	 
	    
	    if (num % 2 == 0 || num % 3 == 0)
	      return 0;
	 
	    
	    for (int i = 5; i * i <= num; i = i + 6)
	      if (num % i == 0 || num % (i + 2) == 0)
	        return 0;
	 
	    return 1;
	  }
	 
	 
	  static int nThPrime(int n)
	  {
	    int i = 2;
	 
	    while (n > 0)
	    {
	 
	
	      if (isPrime(i) == 1)
	        n--;
	 
	      i++; 
	    }
	    i -= 1; 
	    return i;
	  }
	 
	  public static void main(String[] args)
	  {
		  Scanner scn = new Scanner(System.in);
		  int n = scn.nextInt();
		  
	    System.out.println( nThPrime(n));
	   
	  }
	
}
