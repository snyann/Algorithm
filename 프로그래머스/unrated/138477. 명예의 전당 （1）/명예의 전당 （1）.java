import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer=new int[score.length];
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<score.length; i++){
            if(list.size()<k){
                list.add(score[i]);
                Collections.sort(list, Collections.reverseOrder());
                answer[i]=list.get(list.size()-1);
            }else{
                if(score[i]>list.get(list.size()-1)){
                    list.set(list.size()-1,score[i]);
                    Collections.sort(list, Collections.reverseOrder());
                    answer[i]=list.get(list.size()-1);
                }else answer[i]=list.get(list.size()-1);
            }
        }
        return answer;
    }
}