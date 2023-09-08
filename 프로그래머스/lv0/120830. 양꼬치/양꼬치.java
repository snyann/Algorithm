class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int count=n/10;
        if(count!=0) k=k-count;
        answer=n*12000+k*2000;
        return answer;
    }
}