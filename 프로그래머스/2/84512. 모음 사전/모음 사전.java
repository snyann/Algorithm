import java.util.*;
class Solution {
    public static ArrayList<String> list= new ArrayList<>();
    public static String[] arr= {"A","E","I","O","U"};
    public int solution(String word) {
        int answer = 0;
        dfs("",0);
        for(int i=0; i<list.size(); i++){
            if(word.equals(list.get(i))) answer=i;
        }
        return answer;
    }
    public static void dfs( String str, int depth){
        list.add(str);
        if(depth==5) return;
        for(int i=0; i<arr.length; i++){
            dfs( str+arr[i], depth+1);
        }
    }
}