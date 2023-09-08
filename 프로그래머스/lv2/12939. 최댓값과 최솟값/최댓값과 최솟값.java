import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sarr= s.split(" ");
        int[] iarr=new int[sarr.length];
        for(int i=0; i<sarr.length; i++){
            iarr[i]=Integer.parseInt(sarr[i]);
        }
        Arrays.sort(iarr);
        answer+=String.valueOf(iarr[0])+" "+String.valueOf(iarr[iarr.length-1]);
        return answer;
    }
}