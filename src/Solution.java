import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference(){
        int x= 0;

        for (int q: elements){
            System.out.println(q);
        }
        for (int y:elements){
            for (int z: elements){
                if (y-z>x){
                    System.out.println(y-z);
                    x=y-z;
                    System.out.println(x);
                }
            }
        }
        maximumDifference=x;
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);


        D.computeDifference();

        System.out.print(D.maximumDifference);
    }
}