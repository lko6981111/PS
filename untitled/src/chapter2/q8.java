package chapter2;

import java.util.LinkedList;
import java.util.Stack;

public class q8 {


    public static void main(String[] args) {
        String s = "()())";
        System.out.println(solution(s));
    }

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        if(s.charAt(0)==')'||s.isEmpty()){
            return false;
        }

        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(s.charAt(i));
            }

            //EmptyStackException은 스택이 비어 있는 상태에서 peek() 또는 pop()을 호출할 때 발생
            if(s.charAt(i)==')')
            {
                if(s.charAt(i) == ')') {
                    //예외상황 발생안하게 stack이 비어있는지부터 확인
                    if(!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }

        }

        if(stack.isEmpty())
        {
            return true;
        }

        return false;

    }
}
