class Solution {
    public int[] solution(String s) {
        String[] arr=s.split("");
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
             answer[i]=-1;
             for (int j = i-1; j >= 0; j--) {
                if (arr[j].equals(arr[i])) {
                    answer[i] = i - j;
                    break;
                }
            }
        }
        return answer;
    }
}