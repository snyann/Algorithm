import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] slist=String.valueOf(n).split("");
        Arrays.sort(slist,Collections.reverseOrder());
        StringBuilder sb= new StringBuilder();
        for(String s:slist){
            sb.append(s);
        }
        answer=Long.parseLong(sb.toString());
        return answer;
    }
}