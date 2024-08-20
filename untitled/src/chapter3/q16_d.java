package chapter3;

import java.util.Arrays;

public class q16_d {

    class Solution {

        public static void main(String[] args) {
            int[] progresses = {95, 90, 99, 99, 80, 99};
            int[] speeds = {1, 1, 1, 1, 1, 1};

            System.out.println(Arrays.toString(solution(progresses, speeds)));
        }

        public static int[] solution(int[] progresses, int[] speeds) {
            int[] dayOfend = new int[100];
            int day = -1;
            for(int i=0; i<progresses.length; i++) {
                while(progresses[i] + (day*speeds[i]) < 100) {
                    day++;
                }
                dayOfend[day]++;
            }
            return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
        }
    }
}
