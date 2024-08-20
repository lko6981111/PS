package chapter2;

import java.util.Stack;

public class q12_A {

    public static void main(String[] args) {

    }

    public static int[] solution(int[] prices) {
        int[] ans = new int[prices.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);


        for(int i=0; i<prices.length;i++)
        {
            while(!stack.isEmpty()&&prices[i]<prices[stack.peek()])
            {
                int j = stack.pop();
                ans[j] = i - j;
            }

            stack.push(i);
        }

        while(!stack.isEmpty()){
            int j = stack.pop();
            ans[j] = prices.length-j-1;
        }
        return ans;
    }
}
