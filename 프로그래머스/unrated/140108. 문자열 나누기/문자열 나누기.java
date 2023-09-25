import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        char x=s.charAt(0);
        int xCount=0;
        int notXCount=0;
        int temp=0;
        while(true){
            for(int i=temp; i<s.length(); i++){
                if(i==s.length()-1){
                    answer++;
                    return answer;
                }
                if(s.charAt(i)==x) xCount++;
                if(s.charAt(i)!=x) notXCount++;
                if(xCount==notXCount){
                    answer++;
                    xCount=0;
                    notXCount=0;
                    temp=i+1;
                    x=s.charAt(temp);
                    break;
                }
            } 
        }
    }
}