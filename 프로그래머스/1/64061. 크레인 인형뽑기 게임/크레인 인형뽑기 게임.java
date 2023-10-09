import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack= new Stack<>();
        for(int i=0; i<moves.length; i++){
            int col=moves[i]-1;
            for(int row=0; row<board.length; row++){
                if(board[row][col]!=0){
                    int n=board[row][col];
                    board[row][col]=0;
                    if(!stack.isEmpty()&&stack.peek()==n){
                        stack.pop();
                        answer+=2;
                    }else{
                        stack.push(n);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}