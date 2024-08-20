package chapter1;

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] arr = {1,-5,2,4,3};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

}
