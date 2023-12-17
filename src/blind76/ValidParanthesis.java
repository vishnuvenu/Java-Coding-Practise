package blind76;

import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {

        String input = "[[{}()]]]";

        System.out.println(validP(input));
    }

    public static boolean validP(String input) {

        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '[' || input.charAt(i) == '{' || input.charAt(i) == '(') {
                st.push(input.charAt(i));
            }
            else {
                if(st.empty()) return false;

                if (input.charAt(i) == '}')
                    if (st.pop() != '{') return false;
                if (input.charAt(i) == ']')
                    if (st.pop() != '[') return false;
                if (input.charAt(i) == ')')
                    if (st.pop() != '(') return false;
            }
        }
        if(st.empty()) return true;
        else return false;

    }
}
