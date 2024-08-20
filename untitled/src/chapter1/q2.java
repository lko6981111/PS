package chapter1;

import java.util.*;

public class q2 {
    public static void main(String[] args) {
        int[] arr = {1,-5,2,4,4,3,3,3,3};

        System.out.println(Arrays.toString(solution(arr)));

    }

    public static int[] solution(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();

        for (int n : arr) {
            set.add(n);
        }

        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list, Collections.reverseOrder());
        int[] intArray = new int[list.size()];

        for(int i=0; i<list.size();i++){
            intArray[i] = list.get(i);
        }

        return intArray;
    }


}
