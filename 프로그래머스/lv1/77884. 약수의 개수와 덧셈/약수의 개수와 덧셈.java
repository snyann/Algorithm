class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count =0;
        for(int j=left; j<=right; j++){
            for (int i=1; i*i<=j; i++){
                if(i*i==j) count++;
                else if(j%i==0) count+=2;
                
            }
            if(count%2==0) answer+=j;
            else answer-=j;
            count=0;
        }
        return answer;
    }
}