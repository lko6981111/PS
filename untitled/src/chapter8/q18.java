package chapter8;

import java.util.HashSet;

public class q18 {
    public static void main(String[] args) {

    }


    public boolean solution(int[] arr, int target) {
        HashSet<Integer> hashSet = new HashSet<>();
        //HashSet을 통해 중복 제거

        for(int i : arr)
        {
            if(hashSet.contains(target-i))//target-i를 통해
            {
                return true;
            }
            else{
                hashSet.add(i);
            }
        }

        return false;
    }
}
