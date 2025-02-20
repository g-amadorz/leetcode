package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<Character>();

        ArrayList<String> validPairs = new ArrayList<String>();

        //Character init = s.charAt(0);

        //chars.push(init);

        validPairs.add("()");
        validPairs.add("{}");
        validPairs.add("[]");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (chars.isEmpty()) {
                chars.push(c);
            } else {
                char d = chars.peek();

                String check = d + "" + c;

                System.out.println(check);

                if (validPairs.contains(check)) {
                    chars.pop();
                } else {
                    chars.push(c);
                }
        }
            }

        return chars.isEmpty();
    }
}
