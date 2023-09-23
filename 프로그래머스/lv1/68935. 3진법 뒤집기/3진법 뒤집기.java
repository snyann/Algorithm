import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(n != 0) {
            arr.add(n%3);
            n /= 3;
        } 
        Collections.reverse(arr);
        for(int i=0; i<arr.size(); i++) {
            answer += arr.get(i)*Math.pow(3,i);
        }
        return answer;
    }
} 