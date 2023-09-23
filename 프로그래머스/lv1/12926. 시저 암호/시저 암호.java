class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        char[] up=upper.toCharArray();
        char[] low=lower.toCharArray();
        
        char[] c=s.toCharArray();
        for(int i=0; i<c.length; i++){
            for(int j=0; j<26; j++){
                if(c[i]==up[j]) {
                    c[i]=up[(j+n)%26];
                    answer+=c[i];
                    break;
                }
                if(c[i]==low[j]){
                    c[i]=low[(j+n)%26];
                    answer+=c[i];
                    break;
                }
                if(c[i]==' '){
                    answer+=c[i];
                    break;
                }
            }
        }
        
        return answer;
    }
}