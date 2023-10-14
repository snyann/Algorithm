import java.util.*;
class Solution {
    public static int[][] map;
    public int solution(int n, int[][] wires) {
        int answer = n;
        map= new int[n+1][n+1];
        
        for(int i=0; i<wires.length; i++){
            int a=wires[i][0];
            int b=wires[i][1];
            map[a][b]=1;
            map[b][a]=1;
        }
        
        for(int i=0; i<wires.length; i++){
            int a=wires[i][0];
            int b=wires[i][1];
            map[a][b]=0;
            map[b][a]=0;
            
            answer=Math.min(answer, bfs(n,i+1));
            
            map[a][b]=1;
            map[b][a]=1;
        }
        return answer;
    }
    public static int bfs(int n, int start){
        int cnt=1;
        Queue<Integer> q= new LinkedList<>();
        boolean[] visit= new boolean[n+1];
        q.add(start);
        visit[start]=true;
        while(!q.isEmpty()){
            int now=q.poll();
            for(int i=1; i<=n; i++){
                if(map[now][i]==1&&!visit[i]){
                    visit[i]=true;
                    q.add(i);
                    cnt++;
                }
            }
        }
        return Math.abs(n-cnt-cnt);
    }
}