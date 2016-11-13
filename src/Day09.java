import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day09 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(factorial(x));
    }

    private static long factorial(int n)
    {
        if (n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }
}