package chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class q3 {
    public static void main(String[] args) {
        int[] test = {5,0,2,7};

        System.out.println(Arrays.toString(solution(test)));
    }

    public static int[] solution(int[] numbers) {

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<numbers.length; i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                list.add(numbers[i]+numbers[j]);
            }
        }

        // 스트림을 사용하여 중복 제거 및 정렬 후 int 배열로 변환
        int[] array = list.stream()
                .distinct()  // 중복 제거
                .sorted()    // 정렬 (원하지 않으면 생략 가능)
                .mapToInt(Integer::intValue)  // Integer를 int로 변환
                .toArray();  // 배열로 변환

        return array;
    }
}
