import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer,Double> map=new HashMap<>();
        for(int i=1; i<=N; i++){
            double notclear=0;
            double total=0;
            for(int j=0; j<stages.length; j++){
                if(i==stages[j]) notclear++;
                if(i<=stages[j]) total++;
            }
            if(total == 0 && notclear == 0) total = 1;
            map.put(i,notclear/total);
        }
        
        int[] answer=new int[N];
        for(int i=0; i<N; i++){
            double max=-1;
            int key=0;
            for(int j: map.keySet()){
                if(max<map.get(j)){
                    max=map.get(j);
                    key=j;
                }
            }
            answer[i]=key;
            map.remove(key);
        }
        return answer;
    }
}