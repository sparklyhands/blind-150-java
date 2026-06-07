package arrays;

import java.util.Stack;

public class LC20_E_ValidParentheses {

    /**
     * LeetCode Problem: #20 — Valid Parentheses (Easy)
     *
     * Time Complexity:  O(n)
     *   - Each character is pushed/popped at most once.
     *
     * Space Complexity: O(n)
     *   - Stack can hold all opening brackets in worst case.
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // 1. Push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            // 2. Handle closing brackets
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        // 3. Stack must be empty at the end
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        LC20_E_ValidParentheses sol = new LC20_E_ValidParentheses();

        System.out.println(sol.isValid("()"));        // true
        System.out.println(sol.isValid("()[]{}"));    // true
        System.out.println(sol.isValid("(]"));        // false
        System.out.println(sol.isValid("([)]"));      // false
        System.out.println(sol.isValid("{[]}"));      // true
    }
}


/*
===========================================================
   DIAGRAM — HOW VALID PARENTHESES WORKS (STACK VISUAL)
===========================================================

Example Input:
    s = "({[]})"

We process the string left → right and use a stack.

STEP-BY-STEP STACK OPERATIONS:

1. '(' → opening → push
       stack = [ ( ]

2. '{' → opening → push
       stack = [ (, { ]

3. '[' → opening → push
       stack = [ (, {, [ ]

4. ']' → closing → must match top '['
       top = '[' → matches → pop
       stack = [ (, { ]

5. '}' → closing → must match top '{'
       top = '{' → matches → pop
       stack = [ ( ]

6. ')' → closing → must match top '('
       top = '(' → matches → pop
       stack = [ ]

END OF STRING:
       stack is empty → VALID


------------------------------
INVALID EXAMPLE: "([)]"
------------------------------

Process:
    '(' → push → [ ( ]
    '[' → push → [ (, [ ]
    ')' → closing → top is '[' → mismatch → INVALID


===========================================================
This diagram helps visualize how the stack grows and shrinks
as brackets open and close in correct order.
===========================================================
*/
