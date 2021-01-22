package challenges.stacksandqueues;

import java.util.Stack;

/*
* A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is balanced if the following conditions are met:

It contains no unmatched brackets.
The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
*
* */
public class BalancedBrackets {
    //Takes O(n) space and Time complexity
    static String isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()){
            switch (c){
                case '{':
                    stack.push('{');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case '(':
                    stack.push('(');
                    break;
                case '}':
                    if (stack.empty() || stack.peek() != '{'){
                        return "NO";
                    }
                    stack.pop();
                    break;
                case ']':
                    if (stack.empty() || stack.peek() != '['){
                        return "NO";
                    }
                    stack.pop();
                    break;
                case ')':
                    if (stack.empty() || stack.peek() != '('){
                        return "NO";
                    }
                    stack.pop();
                    break;

            }
        }
        return stack.empty() ? "YES" : "NO";
    }
}
