package chapter1;

import java.util.ArrayList;
import java.util.Arrays;

public class q4 {


    public static void main(String[] args) {

        int[] answers = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(solution(answers)));

    }

    public static int[] solution(int[] answers) {
        int[][] patterns = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] scores = {0, 0, 0};
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < patterns.length; j++) {

                if (answers[i] == patterns[j][i % patterns[j].length]) {
                    scores[j]++;
                }

            }
        }

        int maxScore = Arrays.stream(scores).max().getAsInt();

        ArrayList<Integer> winner = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                winner.add(i + 1);
            }
        }

        return winner.stream().mapToInt(Integer::intValue).toArray();


    }

}
