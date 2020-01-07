package Hackerrank_30_Days_Code;

import java.util.Scanner;

public class Day_25_RunningTimeAndComplexity {
	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		  
		  Scanner in = new Scanner(System.in);
		    int n = in.nextInt();
		    int[] a = new int[n];
		    
		    for(int i = 0; i < a.length; i++)
		    {
		    	a[i] = in.nextInt();
		    }
		    
		    for (int i = 0; i < a.length; i++) {
		        if (isPrime(a[i])) {
		            System.out.println("Prime");
		        } else {
		            System.out.println("Not prime");
		        }
		    }
		    in.close();
		    
		  
	    }
	  
	  public static boolean isPrime(int n){
		  
		  if(n == 2){
		        return true;
		    }
		  
		    if(n == 1 || n % 2 == 0){
		        return false;
		    }
		   
		    for (int i = 3; i * i <= n;) {
		        if (n % i == 0) {
		            return false;
		        }
		        i += 2; 
		    }
		    return true;
		}
	  
	  
}
