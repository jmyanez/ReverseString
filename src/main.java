import java.util.Stack;
import java.util.*;

public class main {
    public static void main(String[] args) {
        String myString = "Hello Wordl!";

        StringBuilder input1 = new StringBuilder();

        input1.append(myString);

        String reversed = input1.reverse().toString();



        System.out.print(reversed);
       // return reversed;

    }
}
