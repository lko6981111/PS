package chapter2;

import java.util.Arrays;

public class q12 {
    public static void main(String[] args) {
        int[] arr = {1000, 500, 89, 44, 5, 5, 5, 55, 5, 5, 4, 1, 11, 1, 1, 1, 1, 1, 1, 1, 1, 11, 1};

        System.out.println(Arrays.toString(solution(arr)));


    }

    public static int[] solution(int[] prices) {
        int[] ans = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                ans[i]++;
                if (prices[i] > prices[j])
                    break;

            }
        }

        return ans;
    }
}
