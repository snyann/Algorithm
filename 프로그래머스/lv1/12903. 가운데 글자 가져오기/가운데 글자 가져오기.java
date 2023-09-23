class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c= s.toCharArray();
        if(c.length%2==1) answer=String.valueOf(c[c.length/2]);
        else answer=String.valueOf(c[c.length/2-1])+String.valueOf(c[c.length/2]);
        return answer;
    }
}