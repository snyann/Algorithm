class Solution {
    public static int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int minLength = Integer.MAX_VALUE;
        
        int left = 0;
        int right = 0;
        int sum = 0;
        
        while (right < sequence.length) {
            sum += sequence[right];
            
            while (sum > k) {
                sum -= sequence[left];
                left++;
            }
            
            if (sum == k) {
                int length = right - left + 1;
                if (length < minLength) {
                    minLength = length;
                    answer[0] = left;
                    answer[1] = right;
                }
                
                // 다음 부분 수열을 확인하기 위해 left를 한 칸 이동
                sum -= sequence[left];
                left++;
            }
            
            right++;
        }
        
        return answer;
    }
}