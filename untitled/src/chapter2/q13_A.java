package chapter2;

import java.util.Stack;

public class q13_A {

    public static void main(String[] args) {
        int[][]board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(board,moves));
    }

    public static int solution(int[][] board, int[] moves) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer>[] stacklist = new Stack[board.length];
        for (int i = 0; i < stacklist.length; i++) {
            stacklist[i] = new Stack<>();
        }

       for(int i=board.length-1;i>=0;i--)
       {
           for(int j=0; j<board[i].length;j++)
           {
               if(board[i][j]>0){
                   stacklist[j].push(board[i][j]);
               }
           }
       }

        for (int move : moves) {
            if (!stacklist[move - 1].isEmpty()) {
                int tmp = stacklist[move-1].pop();
                if ((!stack.isEmpty()) && stack.peek() == tmp) {
                    stack.pop();
                    answer+=2;
                } else {
                    stack.push(tmp);
                }
            }

        }

        return answer;
    }
}
