package chapter3;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Queue;

public class q15 {

    public static void main(String[] args) {

        System.out.println(solution(5,2));
    }

    public static int solution(int n,int k){
        Queue<Integer> queue = new ArrayDeque<>();


        for(int i=1; i<=n;i++)
        {
          queue.add(i);
        }

        while(queue.size()!=1)
        {
            for(int i=1; i<k;i++)
            {
                int first = queue.poll();
                //System.out.println(first);
                queue.add(first);
            }

            queue.poll();
        }

        return queue.poll();
    }
}
