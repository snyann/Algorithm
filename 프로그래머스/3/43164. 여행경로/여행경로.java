import java.util.*;
class Solution {
    public boolean[] visited;
    public PriorityQueue<String> pq= new PriorityQueue<>();
    public String[] solution(String[][] tickets) {
        visited=new boolean[tickets.length];
        dfs("ICN","ICN",tickets,0);
        String[] answer = pq.peek().split(",");
        return answer;
    }
    public void dfs(String start, String route, String[][] tickets, int depth){
        if(depth==tickets.length){
            pq.add(route);
            return;
        }
        for(int i=0; i<tickets.length; i++){
            if(!visited[i] && start.equals(tickets[i][0])) {
                visited[i]=true;
                dfs(tickets[i][1], route+","+tickets[i][1], tickets, depth+1);
                visited[i]=false;
            }
        }
    }
}