package chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class q6 {
    public static void main(String[] args) {
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        System.out.println(Arrays.toString(solution(5,stages)));
    }

    public static int[] solution(int N, int[] stages) {

        int[] level = new int[501];
        HashMap<Integer,Double> value= new HashMap<>();

        for(int i=0;i< stages.length;i++){
            level[stages[i]]++;
        }

        double total = stages.length;

        for(int i=1; i<=N;i++)
        {
            if(level[i]==0){
                value.put(i,0.);
            }
            else{
                value.put(i,level[i]/total);
                total -= level[i];
            }
        }

        return value.entrySet().stream().sorted(((o1, o2) -> Double.compare(o2.getValue(),o1.getValue()))).mapToInt(HashMap.Entry::getKey).toArray();
    }
}
