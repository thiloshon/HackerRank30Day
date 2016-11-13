/**
 * Created by Thiloshon on 11-May-16.
 */

import java.util.*;
import java.io.*;

public class Calculator {
    //Write your code here
    int power(int n, int p) throws Exception {
        if (n<0||p<0){
            throw new Exception("n and p should be non-negative");
        }
        //throw new Exception("n and p should be non-negative");

        int ans=0;
        //int

        try{
            ans = (int) Math.pow((double)n, (double) p);
        }catch (Exception x){
            System.out.println("n and p should be non-negative");
        }
        return ans;

    }


    class Solution {


        public void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int T = in.nextInt();
            while (T-- > 0) {
                int n = in.nextInt();
                int p = in.nextInt();
                Calculator myCalculator = new Calculator();
                try {
                    int ans = myCalculator.power(n, p);
                    System.out.println(ans);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }

}
