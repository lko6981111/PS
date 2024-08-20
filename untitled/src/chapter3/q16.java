package chapter3;

import java.util.ArrayList;
import java.util.Arrays;

public class q16 {

    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }


    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> asw = new ArrayList<>();
        int[] enddate = new int[progresses.length];

        //1. 각 작업의 배포 가능일 계산
        for (int i = 0; i < progresses.length; i++) {

            enddate[i] = (int)Math.ceil((100.0-progresses[i])/speeds[i]);

        }

        int i = 0;
        while (i != progresses.length) {
            int count = 1;
            int flag = enddate[i];


            if (i == progresses.length - 1) {
                asw.add(count);
                break;
            }


            int j = i + 1;

            while (j<progresses.length&&flag > enddate[j]) {
                count++;
                j++;
            }
            asw.add(count);
            i = j;
        }


        //System.out.println(asw.toString());

        int[] answer = asw.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
