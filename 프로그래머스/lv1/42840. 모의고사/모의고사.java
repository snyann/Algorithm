import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] first={1,2,3,4,5};
        int[] second={2,1,2,3,2,4,2,5};
        int[] third={3,3,1,1,2,2,4,4,5,5};
        int[] count=new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i]==first[i%5]) count[0]++;
            if(answers[i]==second[i%8]) count[1]++;
            if(answers[i]==third[i%10]) count[2]++;
        }
        int max=Math.max(count[0],Math.max(count[1],count[2]));
        ArrayList<Integer> arr= new ArrayList<Integer>();
        if(max==count[0]) arr.add(1);
        if(max==count[1]) arr.add(2);
        if(max==count[2]) arr.add(3);
        
        answer=new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i]=arr.get(i);
        }
        
        return answer;
    }
}
