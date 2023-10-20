import java.util.*;
class Solution {
    public int[] dx={-1,1,0,0};
    public int[] dy={0,0,-1,1};
    public char[][] map;
    public boolean[][] visited;
    public int[] solution(String[] maps) {
        ArrayList<Integer> list= new ArrayList<>();
        map= new char[maps.length][maps[0].length()];
        visited= new boolean[map.length][map[0].length];
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                map[i][j]=maps[i].charAt(j);
            }
        }
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                if(!visited[i][j] && map[i][j]!='X'){
                    list.add(bfs(i,j));
                }
            }
        }
        if(list.size()==0) list.add(-1);
        Collections.sort(list);
        int[] answer= new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]= list.get(i);
        }
        return answer;
    }
    public int bfs(int i, int j){
        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{i,j});
        visited[i][j]=true;
        int sum=0;
        while(!q.isEmpty()){
            int[] now=q.poll();
            int x= now[0];
            int y= now[1];
            sum+=map[x][y]-'0';
            for(int k=0; k<4; k++){
                int nx= x+dx[k];
                int ny= y+dy[k];
                if(nx<0 || ny<0 || nx>=map.length || ny>=map[0].length) continue;
                if(!visited[nx][ny] && map[nx][ny]!='X'){
                    visited[nx][ny]=true;
                    q.add(new int[]{nx,ny});
                }
            }
        }
        return sum;
    }
}