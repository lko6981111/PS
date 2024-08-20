package chapter2;

import java.util.ArrayDeque;

public class q8_2 {

    public static void main(String[] args) {
        String s = "()())";
        System.out.println(solution(s));
    }


    private static boolean solution(String s){
        ArrayDeque<Character> stack = new ArrayDeque<>();

        char[]a = s.toCharArray();
        for(char c : a){
            if(c=='('){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()||stack.pop()==c){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
