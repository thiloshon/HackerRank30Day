/**
 * Created by Thiloshon on 01-Jun-16.
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Day29 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int maax=0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            for (int x=1; x<=n;x++ ){
                for (int y=1; y<n; y++){
                    System.out.print("x is "+ x + " and y is "+ y + " and X AND Y is " + (x&y));
                    if ((x&y)>maax&&x!=y){
                        System.out.println("  YES");
                        if ((x&y)<k){
                            maax=x&y;

                        }
                    }
                    System.out.print("\n");
                }
            }
            System.out.println(maax);
            maax=0;

        }
    }
}



