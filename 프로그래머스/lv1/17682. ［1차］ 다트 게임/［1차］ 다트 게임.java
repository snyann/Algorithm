import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        ArrayList<Integer> list= new ArrayList<>();
        String num="";
        char[] c= dartResult.toCharArray();
        for(int i=0; i<c.length; i++){
            if(c[i]>='0'&&c[i]<='9'){
                num+=c[i];
            }
            else if(c[i]=='S'||c[i]=='D'||c[i]=='T'){
                int n=Integer.parseInt(num);
                if(c[i]=='S') list.add((int)Math.pow(n,1));
                else if(c[i]=='D') list.add((int)Math.pow(n,2));
                else list.add((int)Math.pow(n,3));
                num="";
            }
            else{
                if(c[i]=='*') {
                    if(list.size()==1) list.set(list.size()-1, list.get(list.size()-1)*2);
                    else{
                        list.set(list.size()-1, list.get(list.size()-1)*2);
                        list.set(list.size()-2, list.get(list.size()-2)*2);
                    }
                }
                else list.set(list.size()-1, list.get(list.size()-1)*-1);
            }
        }
        for(int i=0; i<list.size(); i++){
                answer+=list.get(i);
            }
        return answer;
    }
}