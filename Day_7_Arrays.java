package Hackerrank_30_Days_Code;

import java.util.Scanner;

public class Day_7_Arrays {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];        
        int count = n;
        
        while (count > 0) {
            arr[count-1] = scanner.nextInt();
            count--;
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        scanner.close();
    }
}
