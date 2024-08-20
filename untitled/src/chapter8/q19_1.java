package chapter8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class q19_1 {
    public static void main(String[] args) {

       String[] p = {"mislav", "stanko", "mislav", "ana"};
       String[] c = {"stanko", "ana", "mislav"};

       System.out.println(solution(p,c));
    }

    public static String solution(String[] participant, String[] completion) {
        ArrayList<String> arrayList = new ArrayList<>(List.of(participant));
        ArrayList<String> arrayList2 = new ArrayList<>(List.of(completion));

        Iterator<String> iterator1 = arrayList.iterator();

        while(iterator1.hasNext()) {
            String p = iterator1.next();
            //System.out.println(p);

            Iterator<String> iterator2 = arrayList2.iterator();
            while(iterator2.hasNext()){
                String c = iterator2.next();
                if(p.equals(c))
                {
                    iterator1.remove();
                    iterator2.remove();
                    break;
                }
            }
        }

        return arrayList.get(0);
    }
}
