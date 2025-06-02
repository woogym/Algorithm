package Algorithm.Backjoon.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

// 미로 탐색, 그래프
public class B2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int[][] maps = new int[row][col];

        for (int i = 0; i < row; i++) {
            String line = br.readLine();
            for (int j = 0; j < col; j++) {
                maps[i][j] = line.charAt(j) - '0';
            }
        }

        System.out.println(BFS(maps, row, col));
    }

    private static int BFS(int[][] maps, int row, int col) {
        boolean[][] visited = new boolean[row][col];
        Queue<int[]> queue = new ArrayDeque<>();

        queue.add(new int[] {0,0,1});

        while (!queue.isEmpty()) {
            int[] u = queue.remove();
            int r = u[0], c = u[1], distance = u[2];
            if (maps[r][c] == 0) continue;
            if (visited[r][c]) continue;
            visited[r][c] = true;

            if (r == row - 1 && c == col - 1) return distance;

            if (0 < r) queue.add(new int[] {r - 1, c, distance+1});
            if (0 < c) queue.add(new int[] {r, c - 1, distance+1});
            if (r < row - 1) queue.add(new int[] {r+1, c, distance+1});
            if (c < col - 1) queue.add(new int[] {r, c + 1, distance+1});
        }

        return 0;
    }
}
