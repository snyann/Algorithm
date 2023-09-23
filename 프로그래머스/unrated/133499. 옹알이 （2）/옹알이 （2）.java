import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] list= {"aya", "ye", "woo", "ma"};
        for(String b: babbling){
            for(String l: list){
                if(b.contains(l+l)) continue;
                if(b.contains(l)) b=b.replace(l," ");
            }
            b=b.replace(" ","");
            if(b.length()==0) answer++;
            System.out.println(b);
        }
        return answer;
    }
}