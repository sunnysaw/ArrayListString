/*
Question : Write a program to sort an arraylist of string in descending order.
 */
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("welcome");
        a.add("to");
        a.add("physics");
        a.add("wallah");
        System.out.println(a);
        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);
    }
}