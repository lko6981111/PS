package chapter3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class q17 {

    public static void main(String[] args) {

    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> q1 = new ArrayDeque<>(Arrays.asList(cards1));
        Queue<String> q2 = new ArrayDeque<>(Arrays.asList(cards2));
        Queue<String> q3 = new ArrayDeque<>(Arrays.asList(goal));

        for(String g : q3)
        {
            if(!q1.isEmpty()&&q1.peek().equals(g))
            {
                q1.poll();
                q3.poll();
            }
            else if(!q2.isEmpty()&&q2.peek().equals(g))
            {
                q2.poll();
                q3.poll();
            }
            else{
                break;
            }
        }

        return q3.isEmpty() ? "Yes" : "No";
    }
}
