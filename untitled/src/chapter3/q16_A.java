package chapter3;

import java.util.ArrayList;
import java.util.Arrays;

public class q16_A {

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

        int count = 0;
        int maxday = enddate[0];

        for(int i=0; i<enddate.length;i++)
        {
            if(enddate[i]<=maxday)
            {
                count++;
            }
            else{
                asw.add(count);
                count=1;
                maxday=enddate[i];
            }
        }

        asw.add(count);

        return asw.stream().mapToInt(Integer::intValue).toArray();
    }
}
