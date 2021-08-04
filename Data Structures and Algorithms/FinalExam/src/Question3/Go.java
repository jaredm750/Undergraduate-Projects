package Question3;
import java.util.*;

public class Go{
    public static void main(String[] args) {
        int [][] grid={
                {-1,-1,-1,-1,-1,-1,-1,-1,},
                {-1,-1,-1,-1,-1,-1,-1,-1,},
                {-1,-1,-1,-1,-1,0,-1,-1,},
                {-1,-1,-1,-1,0,1,0,-1,},
                {-1,-1,-1,0,1,1,0,-1,},
                {-1,-1,-1,-1,0,0,-1,-1,},
                {-1,-1,-1,-1,-1,-1,-1,-1,},
                {-1,-1,-1,-1,-1,-1,-1,-1,},};

        System.out.println(capture(grid,8,8));
    }

    private static int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static int capture(int[][] board, int row, int col) {
        if (board == null || board.length == 0 || isOutOfBounds(board, row, col) || board[row][col] != -1) return 0;
        int m = board.length, n = board[0].length;

        boolean[][] visited = new boolean[m][n];
        visited[row][col] = true;

        int count = 0;
        for (int[] dir : directions) {
            count += bfs(board, visited, row + dir[0], col + dir[1]);
        }
        return count;
    }
    private static int bfs(int[][] board, boolean visited[][], int row, int col) {
        int count = 0;
        boolean val = true;
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{row, col});
        while (!q.isEmpty()) {
            int[] loc = q.poll();
            int x = loc[0], y = loc[1];
            if (isOutOfBounds(board, x, y) || visited[x][y] || board[x][y] == 1) continue;
            if (board[x][y] == -1) {
                val = false;
            } else {
                visited[x][y] = true;
                for (int[] dir : directions) {
                    q.offer(new int[]{x + dir[0], y + dir[1]});
                }
                count++;
            }
        }
        return val ? count : 0;
    }
    private static boolean isOutOfBounds(int[][] board, int x, int y) {
        return x < 0 || y < 0 || x > board.length - 1 || y > board[0].length - 1;
    }
}