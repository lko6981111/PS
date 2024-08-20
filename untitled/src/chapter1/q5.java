package chapter1;

import java.util.Arrays;

public class q5 {
    public static void main(String[] args) {

        int[][] arr1 = {{1,4},{3,2},{4,1}};
        int[][] arr2 = {{3,3},{3,3}};

        System.out.println(Arrays.deepToString(solution(arr1,arr2)));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {

        int a = arr1.length;
        int b = arr1[0].length;
        int c = arr2[0].length;
        int[][] answer = new int[a][c];

        int tmp = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < b; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }


        return answer;


    }
}
