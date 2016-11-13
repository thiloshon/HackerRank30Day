import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by Thiloshon on 12-May-16.
 */
public class Day18 {


    // Write your code here.
    Stack st = new Stack();


    LinkedList queue = new LinkedList();

    void pushCharacter(char ch){
        st.push(ch);
    }

    void enqueueCharacter(char ch){
        queue.add(ch);
    }

    char popCharacter(){
        char ans =(char)st.pop();
        return ans;
    }

    char dequeueCharacter(){
        char ans = (char) queue.getFirst();
        queue.removeFirst();

        return ans;

    }
}