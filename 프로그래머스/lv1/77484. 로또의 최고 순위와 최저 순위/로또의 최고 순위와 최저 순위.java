class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt=0;
        int cnt2=0;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
                cnt2+=1;
            }
            for(int j=0; j<win_nums.length; j++){
                 if(lottos[i]==win_nums[j]){
                     cnt+=1;
                }
            }
        }
    
        answer[0]=7-(cnt+cnt2);
        answer[1]=7-cnt;
        if(answer[0]==7){
            answer[0]=6;
        }
        if(answer[1]==7){
            answer[1]=6;
        }
        return answer;
    }
}