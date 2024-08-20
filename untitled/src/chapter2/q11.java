package chapter2;

public class q11 {

    public static void main(String[] args) {
        String s = "baabaa";

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        int flag = 0;
        A: while (!sb.isEmpty()) {

            if (flag != 0) {
                break;
            }
            for (int i = 0; i < sb.length() - 1; i++) {

                int j = i + 1;

                if (sb.charAt(i) == sb.charAt(j)) {
                    sb.delete(i, j + 1);
                    continue A;
                }
            }

            flag++;
        }

        if (sb.length()==0) {
            return 1;
        }

        return 0;
    }

}
