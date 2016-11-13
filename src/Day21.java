/**
 * Created by Thiloshon on 15-May-16.
 */
import java.lang.reflect.Method;

class Day21{
    //Write your code here
    public static < E > void printArray( E[] inputArray )
    {
        // Display array elements
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
            System.out.println();
        }

    }

    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        printArray( intArray  );
        printArray( stringArray );

        if(Day21.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}