/**
 * Created by Thiloshon on 19-May-16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Day26 {




        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            //int[] arr= new int[6];
            ArrayList<Integer> arr = new ArrayList<Integer>();
            Scanner sc= new Scanner(System.in);
            int fine=0;

            for(int x=0;x<6;x++){
                int num= sc.nextInt();
                arr.add(num);
            }

            for(int value:arr){
                System.out.println(value);
            }

            if (arr.get(2)-arr.get(5)>0){

                fine =1000;
               // int years= arr.get(2)-arr.get(5);

            }else if (arr.get(1)-arr.get(4)>0){
                int months = arr.get(1)-arr.get(4);
                fine=(months)*500;
            }else if(arr.get(0)-arr.get(3)>0){
                int days=arr.get(0)-arr.get(3);
                fine = days *15;
            }

            System.out.print(fine);
        }

    }
