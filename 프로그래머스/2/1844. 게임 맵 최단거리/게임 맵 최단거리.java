import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] visited = new int[n][m];
        
        initVisitedArray(visited);
        
        visited[0][0] = 1;
        
        return bfs(maps, visited);
    }
    
    private void initVisitedArray(int[][] visited) {
        for (int i = 0; i < visited.length; i++) {
            Arrays.fill(visited[i], Integer.MAX_VALUE);
        }
    }
    
    private int bfs(int[][] maps, int[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0, 0});
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            
            if (x == maps.length - 1 && y == maps[0].length - 1) {
                return visited[x][y];
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (isValidPosition(maps, nx, ny) && canVisit(visited, nx, ny, visited[x][y] + 1)) {
                    visited[nx][ny] = visited[x][y] + 1;
                    queue.offer(new int[] {nx, ny});
                }
            }
        }
        
        return -1;
    }
    
    private boolean isValidPosition(int[][] maps, int x, int y) {
        return x >= 0 && x < maps.length && y >= 0 && y < maps[0].length && maps[x][y] == 1;
    }
    
    private boolean canVisit(int[][] visited, int x, int y, int distance) {
        return visited[x][y] > distance;
    }
}
