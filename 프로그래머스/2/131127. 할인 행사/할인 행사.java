import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        for (int i = 0; i < discount.length - 10 +1; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < want.length; j++) {
                map.put(want[j], number[j]);
            }
            for (int k = 0; k < 10; k++) {
                if (map.containsKey(discount[i + k])) {
                    map.put(discount[i + k], map.get(discount[i + k]) - 1);
                }
                if (map.containsKey(discount[i + k]) && map.get(discount[i + k]) == 0) {
                    map.remove(discount[i + k]);
                }
            }
            if (map.isEmpty()) answer++;
        }
        return answer;
    }
}
