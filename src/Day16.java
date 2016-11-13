/**
 * Created by Thiloshon on 11-May-16.
 */

    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

public class Day16 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String S = in.next();

            int ans=0;
           try {
                ans=Integer.parseInt(S);
            }catch (NumberFormatException e){
               System.out.print("Bad String");
           }
            System.out.print(ans);

        }
    }


