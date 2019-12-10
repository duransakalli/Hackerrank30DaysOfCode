package Hackerrank_30_Days_Code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Day_8_DictionariesAndMaps {
    public static void main(String[] argh) {
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        List<String> namelist = new ArrayList<String>();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }

        while(in.hasNext()){
            String s = in.next();
            if (phoneBook.get(s)!=null)                
                System.out.println(s + "=" + phoneBook.get(s) );
            else
                System.out.println("Not found");
        }
        in.close();
    }
}