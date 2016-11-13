/**
 * Created by Thiloshon on 20-May-16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Day27{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


    Scanner sc = new Scanner(System.in);

        System.out.println("2");
        System.out.println("4 3");
        System.out.println("-1 -3 4 2");
        System.out.println("4 2");
        System.out.println("0 -1 2 1");


       // int cases = sc.nextInt();
        int cases =2;
     //   System.out.println(cases);
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<Integer> studentNumber = new ArrayList<Integer>();
        studentNumber.add(4);
        studentNumber.add(4);

        ArrayList<Integer> boundrey = new ArrayList<Integer>();
        boundrey.add(3);
        boundrey.add(2);
        ArrayList<Integer> student = new ArrayList<Integer>();
        student.add(-1);student.add(-3);student.add(4);student.add(2);
        student.add(0);student.add(-1);student.add(2);student.add(1);



        for (int x=0; x<cases; x++){





            int negative = 0;
            int limit=studentNumber.get(x);
            for (int y=0; y<limit;y++){





                if (student.get(y)<0||student.get(y)==0){
                    negative++;
                }
            }

            if (negative>=boundrey.get(x)){
                arr.add("NO");
            }else arr.add("YES");
        }


        for(String stg : arr){
            System.out.println(stg);
        }



        /*for (int x=0; x<cases; x++){
            //int studentNumber = sc.nextInt();
            int studentNumber =4;
        //    System.out.println(studentNumber);
            int boundrey=sc.nextInt();
        //    System.out.println(boundrey);
            int negative = 0;
            for (int y=0; y<studentNumber;y++){

                int value =sc.nextInt();
       //         System.out.println(value);
                if (value<0||value==0){
                    negative++;
                }
            }
         //   System.out.println("Im outta small loopah!");
            if (negative>=boundrey){
                arr.add("NO");
            }else arr.add("YES");
        }
      //  System.out.println("im outta big loopaah");

        for(String stg : arr){
            System.out.println(stg);
        }*/

    }
}
