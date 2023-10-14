class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                // 방문하지 않은 컴퓨터부터 DFS 탐색 시작
                dfs(computers, visited, i);
                answer++;
            }
        }

        return answer;
    }

    private void dfs(int[][] computers, boolean[] visited, int start) {
        visited[start] = true;

        for (int i = 0; i < computers.length; i++) {
            if (computers[start][i] == 1 && !visited[i]) {
                // 연결된 컴퓨터이고 아직 방문하지 않았다면 재귀적으로 DFS 호출
                dfs(computers, visited, i);
            }
        }
    }
}






