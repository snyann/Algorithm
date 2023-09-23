class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] c= phone_number.toCharArray();
        for(int i=0; i<c.length-4; i++){
            c[i]='*';
        }
        answer=String.valueOf(c);
        return answer;
    }
}