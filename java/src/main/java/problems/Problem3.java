/*
For this question, you will parse a string to determine if it contains only "balanced delimiters."

A balanced delimiter starts with an opening character ((, [, {), ends with a matching closing character (), ], } respectively), and has only other matching delimiters in between. A balanced delimiter may contain any number of balanced delimiters.

Examples

The following are examples of balanced delimiter strings:

()[]{}
([{}])
([]{})
The following are examples of invalid strings:

([)]
([]
[])
([})
Input is provided as a single string. Your output should be True or False according to whether the string is balanced. For example:

Input:

([{}])
Output:

True
Input Format and Restrictions

Each test case will consist of a string only containing the characters ()[]{}. The length of the string will not exceed 2KB.
 */
package main.java.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem3 extends Problem {
    @Override
    public void solve() {
        String[] arr = {
                "()[]{}",
                "([{}])",
                "([]{})",
                "([)]",
                "([]",
                "[])",
                "([})"};

        for (String s :
                arr) {
            System.out.println("Given: " + s + ". Result: " + isBalanced(s));
        }

    }

    private boolean isBalanced(String str) {
        Stack<Character> s = new Stack<>();
        Map<Character, Character> m = new HashMap<>();
        m.put(')', '(');
        m.put(']', '[');
        m.put('}', '{');

        for (Character i :
                str.toCharArray()) {
            if (s.isEmpty()) s.push(i);
            else if (m.get(i) == s.lastElement()) s.pop();
            else if (!m.containsKey(i)) s.push(i);
            else return false;
        }
        if (s.isEmpty()) return true;
        else return false;
    }
}
