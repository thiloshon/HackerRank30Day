/**
 * Created by Thiloshon on 06-May-16.
 */

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Day10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max=0;
        int ans=0;

        String num = Integer.toBinaryString(n);

        for (int i = 0; i < num.length(); i++){
            char c = num.charAt(i);
            if (c=='1'){
                max++;
                if(max>ans){
                    ans=max;
                }
            }else{
                if(max>ans){
                    ans=max;
                }
                max=0;
            }

            System.out.println(max);
            //Process char
        }

        System.out.println(ans);
    }
}
