package chapter8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class q19_2 {

    public static void main(String[] args) {

    }

    public static String solution(String[] participant, String[] completion) {
        //1. 해시맵 생성
        HashMap<String, Integer> hashMap = new HashMap<>();

        //2. 완주한 선수들의 이름을 해시맵에 저장
        for(String string : completion){
            hashMap.put(string,hashMap.getOrDefault(string,0)+1);
        }

        //3. 참가한 선수들의 이름을 키로 하는 값을 1씩 감소
        for(String string : participant){
            //4. 완주하지 못한 선수를 찾으면 반환
            if(hashMap.getOrDefault(string,0)==0){
                //getOrDefault : hashmap의 get 메서드랑 비슷, 없으면 default값 반환
                return string;
            }
            hashMap.put(string,hashMap.get(string)-1);
        }

        return null;
    }
}
