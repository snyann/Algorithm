class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] c= s.toCharArray();
        int pcnt=0, ycnt=0;
        
        for(int i=0; i<c.length; i++){
            if(c[i]=='p'|| c[i]=='P') pcnt++;
            if(c[i]=='y'|| c[i]=='Y') ycnt++;
        }
        if (pcnt==ycnt||pcnt==0&&ycnt==0) answer=true;
        else answer=false;
        return answer;
    }
}