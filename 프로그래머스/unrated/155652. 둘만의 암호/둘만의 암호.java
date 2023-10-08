import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb= new StringBuilder();
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            for(int j=0; j<index; j++){
                if(c=='z') c='a';
                else c=(char)(c+1);
                if(skip.contains(String.valueOf(c))){
                    j--;
                }
            }
            sb.append(c);
        }
        answer=sb.toString();
        return answer;
    }
}