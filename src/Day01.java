import java.util.*;

public class Day01 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

              /* Declare second integer, double, and String variables. */
        int number;
        double numberD;
        String string;

        /* Read and save an integer, double, and String to your variables.*/

        number = scan.nextInt();
        numberD = scan.nextDouble();

        //int age = Integer.parseInt(input.nextLine());  Might as well help

        //String string2 = scan.nextLine();
        scan.nextLine();
        string = scan.nextLine();


        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + number);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + numberD);

        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */
        System.out.println(s + string);

        scan.close();
    }
}
