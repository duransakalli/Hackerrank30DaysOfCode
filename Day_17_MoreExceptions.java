package Hackerrank_30_Days_Code;

import java.util.Scanner;

class Calculator{
    public int power(int n, int p) throws Exception {
        int number = 0;
        if(n >= 0 && p >= 0)
        {
            number = (int)Math.pow(n, p);
        } else {
            throw new Exception("n and p should be non-negative");
        }
        
        return number;
    }
}

public class Day_17_MoreExceptions {
	   public static void main(String[] args) {
		    
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        while (t-- > 0) {
	        
	            int n = in.nextInt();
	            int p = in.nextInt();
	            Calculator myCalculator = new Calculator();
	            try {
	                int ans = myCalculator.power(n, p);
	                System.out.println(ans);
	            }
	            catch (Exception e) {
	                System.out.println(e.getMessage());
	            }
	        }
	        in.close();
	    }
}
