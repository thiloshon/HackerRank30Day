import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Thiloshon on 18-May-16.
 */
public class Day25 {




        public static void main(String[] args) {
        /* Enter your code here. */
            //checks whether an int is prime or not.
            ArrayList<Integer> arr = new ArrayList<Integer>();
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            for (int x=0;x<n-1; x++){
                arr.add(sc.nextInt());
                //boolean rime =isP


            }
            for (int num: arr){
                if (isPrime(num)){
                    System.out.println("Prime");
                }else {
                    System.out.println("Not Prime");
                }
            }
        }
        //boolean static method(){
        public static boolean isPrime(int n) {
            //check if n is a multiple of 2
            if (n%2==0) return false;
            //if not, then just check the odds
            for(int i=3;i*i<=n;i+=2) {
                if(n%i==0)
                    return false;
            }
            return true;
        }




}
