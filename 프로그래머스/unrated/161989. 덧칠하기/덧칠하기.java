class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int end=0;
        
        for (int i = 0; i < section.length; i++) {
          if (section[i] < end) {
              continue;
          }

          answer ++;
          end = section[i] + m;
      }
        return answer;
    }
}