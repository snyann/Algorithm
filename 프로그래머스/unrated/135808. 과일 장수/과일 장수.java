import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        ArrayList<Integer> arr= new ArrayList<>();
        int answer = 0;
        Arrays.sort(score);
        for(int i=score.length-1; i>=0; i--){
            arr.add(score[i]);
            if(arr.size()==m){
                answer+=score[i]*m;
                arr.clear();
            }
        }
        return answer;
    }
}
//k는 최상품 점수, m은 개수 