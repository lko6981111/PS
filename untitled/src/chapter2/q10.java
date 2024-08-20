package chapter2;

import java.util.ArrayDeque;
import java.util.Stack;

public class q10 {
    public static void main(String[] args) {
        String s = "[)(]";
        System.out.println(solution(s));
    }

    public static int solution(String s){
        Stack<Character> stack = new Stack<>();

        String s2 = s+s;
        int count =0;



        A: for(int i=0; i<s.length();i++)
        {
            for(int j=i;j<i+s.length();j++) {
                char c = s2.charAt(j);
                if(c=='('||c=='['||c=='{')
                {
                    stack.push(c);
                }
                if(c==')')
                {

                        //예외상황 발생안하게 stack이 비어있는지부터 확인
                        if(!stack.isEmpty() && stack.peek() == '(') {
                            stack.pop();
                        } else {
                            continue A;
                        }

                }
                if(c=='}')
                {

                    //예외상황 발생안하게 stack이 비어있는지부터 확인
                    if(!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        continue A;
                    }

                }
                if(c==']')
                {

                    //예외상황 발생안하게 stack이 비어있는지부터 확인
                    if(!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        continue A;
                    }

                }
            }

            if(stack.isEmpty()){
                count++;
            }

        }

        return count;
    }
}
