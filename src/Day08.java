/**
 * Created by Thiloshon on 01-May-16.
 */import java.util.*;
import java.io.*;
public class Day08 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> arr = new ArrayList<String>();


        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();

            map.put(name, phone);
            //
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            arr.add(s);
            // Write code here
        }
        in.close();

        for(int x=0; x<arr.size(); x++){
            //String stg = arr.get(x);
            if (map.get(arr.get(x))!=null){
                System.out.println(arr.get(x) + "=" + map.get(arr.get(x)));
            }else {
                System.out.println("Not found");
            }

        }

    }
}
//Complete this code or write your own from scratch




