import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        for(int i=0; i<d.length; i++){
            budget-=d[i];
            if(budget<0) break; //예산이 0보다 작은 경우 카운트++하기 전에 break해야함
            answer++;
        }
        return answer;
    }
}