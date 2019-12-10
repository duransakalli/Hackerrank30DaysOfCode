package Hackerrank_30_Days_Code;

import java.util.Scanner;

public class Day_16_Exceptions_StringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String S = in.next();
        
        try {
        	System.out.println(Integer.parseInt(S));
		} catch (Exception e) {
			System.out.println("Bad String");
		}
    }
}
