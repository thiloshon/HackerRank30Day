/**
 * Created by Thiloshon on 29-Apr-16.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day06 {


    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        ArrayList<String> arr = new ArrayList<String>();

        sc.nextLine();


        for (int x = 0; x < lines; x++) {
            String line = sc.nextLine();
            arr.add(line);

        }

        for (String str : arr) {
            int length = str.length();
            for (int y = 0; y < length; y++) {
                System.out.print(str.charAt(y));
                y++;
            }
            System.out.print(" ");
            //int length = str.length();
            for (int y = 1; y < length; y++) {
                System.out.print(str.charAt(y));
                y++;
            }
            System.out.print("\n");
        }


    }
}


