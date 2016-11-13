/**
 * Created by Thiloshon on 15-May-16.
 */
import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
//Write your code here
class Calculator1 implements AdvancedArithmetic {
    public int divisorSum(int num){

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int x=0; x<= (int)num/2; x++){
            if (num%x==0){
                arr.add(x);
            }
        }

        int ans=0;
        for(int value:arr){
            ans=ans+value;
        }
        return ans;
    }

}
public class Day19{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator1();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
