package hacker_ranck.data_structures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isValid(input));
        }
    }

    public static boolean isValid(String input) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);//add item on top
            }else if (st.isEmpty()) {
                return false;
            } else {
                char top = st.pop();
                if ((top == '(' && ch != ')') || (top == '[' && ch != ']') || (top == '{' && ch != '}')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
