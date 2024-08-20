package chapter2;

import java.util.Stack;

public class q9 {
    public static void main(String[] args) {
        int  n = 10;
        System.out.println(solution(n));
    }

    static String solution(int n){
        Stack<Integer> stack = new Stack<>();

        String s="";
        int i=0;

        while(n!=0){
            stack.push(n%2);
            n=n/2;
        }

        while(!stack.isEmpty()){
            s+=Integer.toString(stack.pop());
        }

        return s;

    }
}
