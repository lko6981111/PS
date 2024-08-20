package chapter2;

import java.util.Stack;

public class q11_A {

    public static void main(String[] args) {
        String s = "baabaa";

        System.out.println(solution(s));
    }

    public static int solution(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length();i++) {
            char c = s.charAt(i);

            //1. 스택이 비어 있지 않고, 현재 문자와 스택의 맨위 문자가 같으면
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); //2. 스택의 맨 위 문자 제거
            } else {
                stack.push(c); //3. 스택에 현재 문자 추거
            }
        }

        return stack.isEmpty()? 1:0 ; //4. 스택이 비어 있으면 1, 그ㅓㅎ지 않으면 0 반환
    }

}
