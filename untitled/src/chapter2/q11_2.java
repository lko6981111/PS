package chapter2;

import java.util.Stack;

public class q11_2 {

    public static void main(String[] args) {
        String s = "baabaa";

        System.out.println(solution(s));
    }

    public static int solution(String s) {

        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();

        for(int i=0; i<s.length();i++)
        {
            if(stack.isEmpty())
            {
                stack.push(c[i]);
            }
            else {
                if(stack.peek()==c[i])
                {
                    stack.pop();
                }
                else {
                    stack.push(c[i]);
                }
            }
        }

        if(stack.isEmpty()){
            return 1;
        }

        return 0;
    }
}
