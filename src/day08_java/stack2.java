package day08_java;
import java.util.Stack;
public class stack2 {
        public static void main(String[] args) {
            Stack<String> names= new Stack<>();

            names.push("Prasunamba");
            names.push("Meher");
            names.push(".MK");

            System.out.println("before deletion ");
            System.out.println("Stack of names: " + names);

            System.out.println("after deletion ");
            String dummy = names.pop();

            System.out.println("Stack of names: " + names);
            System.out.println("deleted element is "+ dummy);
        }
    }