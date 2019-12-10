package Hackerrank_30_Days_Code;

import java.util.Scanner;

public class Day_6_LetsReview {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);    
	    int n = in.nextInt();
	    String[] divide = new String[n];
	    
	    for(int i = 0; i < n; i++)
	    {
	        divide[i] = in.next();
	    }
	    
	    for(int i = 0; i < divide.length; i++)
	    {
	        for(int j = 0; j < divide[i].length(); j++)
	        {
	            if(j % 2 == 0) 
	            {
	                System.out.print(divide[i].charAt(j));
	            }
	            
	        }
	        System.out.print(" ");
	        for(int j = 0; j < divide[i].length(); j++)
	        {
	        
	            
	            if(j % 2 == 1) 
	            {
	                System.out.print(divide[i].charAt(j));
	            }
	        }
	        System.out.println();
	        
	    }
	    
	}
}
