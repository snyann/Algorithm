import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q= new LinkedList<>();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<progresses.length; i++){
            if((100-progresses[i])%speeds[i]==0) q.add((100-progresses[i])/speeds[i]);
            else q.add((100-progresses[i])/speeds[i]+1);
        }
        int x=q.poll();
        int cnt=1;
        while(!q.isEmpty()){
            if(q.peek()<=x){
                cnt++;
                q.poll();
            }
            else{
                list.add(cnt);
                cnt=1;
                x=q.poll();
            }
        }
        list.add(cnt);
        int[] answer=new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}