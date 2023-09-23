import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer =new String[n];
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        for(int i=0; i<n; i++){
            list1.clear();
            list2.clear();
            while(arr1[i]!=0){
                list1.add(arr1[i]%2);
                arr1[i]/=2;
            }
            while(arr2[i]!=0){
                list2.add(arr2[i]%2);
                arr2[i]/=2;
            }
            while(list1.size()<n){
                list1.add(list1.size(),0);
            }
            while(list2.size()<n){
                list2.add(list2.size(),0);
            }
            
            Collections.reverse(list1);  
            Collections.reverse(list2);
            System.out.println(list1);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (list1.get(j) == 1 || list2.get(j) == 1) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }

            answer[i] = sb.toString();
        }
        
        return answer;
    }
}