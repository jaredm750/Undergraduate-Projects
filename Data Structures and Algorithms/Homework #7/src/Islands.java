import java.util.*;
public class Islands {
    //USING BFS

    public static void main(String[] args){
        //INPUT 1   4 5
        char [][] grid={
                {'C','C','C','C','C'},
                {'C','C','C','C','C'},
                {'C','C','C','C','C'},
                {'C','C','C','C','C'},};
        System.out.println(numIslands(grid));

        //INPUT 2    3 4
        char [][] grid2={
                {'L','W'},
                {'C','C'},
                {'W','L'},};
        System.out.println(numIslands(grid2));
    }

    public static int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();

        int count = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == 'L' && !visited[i][j]) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                    BFS(grid, queue, visited);
                    count++;
                }
            }
        }
        return count;
    }

    public static void BFS(char[][] grid, Queue<int[]> queue, boolean[][] visited) {
        int[][] dirs = {{0,1}, {1,0}, {0, -1}, {-1, 0}};
        int m = grid.length;
        int n = grid[0].length;

        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int[] dir : dirs) {
                int x = curr[0] + dir[0];
                int y = curr[1] + dir[1];

                if (x < 0 || x >= m || y < 0 || y >=n || visited[x][y] || grid[x][y] == 'W')
                    continue;
                visited[x][y] = true;
                queue.offer(new int[]{x, y});
            }
        }
    }
}
