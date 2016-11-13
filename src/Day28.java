/**
 * Created by Thiloshon on 01-Jun-16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();



        int N = in.nextInt();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            if (emailID.toLowerCase().contains("@gmail.com".toLowerCase())){
                arr.add(firstName);
            }


        }


        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });

        for (String str : arr){
            System.out.println(str);
        }

    }
}


