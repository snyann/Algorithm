import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for(String s : keymap){
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if (map.containsKey(c)) {
                    map.put(c, Math.min(i+1, map.get(c)));
                } else {
                    map.put(c, i+1);
                }
            }
        }
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<targets[i].length(); j++){
                if(map.containsKey(targets[i].charAt(j))){
                    answer[i]+=map.get(targets[i].charAt(j));
                }else{
                    answer[i]=-1;
                    break;
                }
            }
        }
        System.out.println(map.keySet());
        for(Character s: map.keySet()){
            System.out.print(map.get(s));
        }
        return answer;
    }
}