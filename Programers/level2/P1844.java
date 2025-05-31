package Algorithm.Programers.level2;

import java.util.ArrayDeque;
import java.util.Queue;

// 게임 맵 최단거리
public class P1844 {
    class Solution {
        private static int ROW;
        private static int COL;
        private static int[][] A;
        public int solution(int[][] maps) {
            ROW = maps.length; // 세로
            COL = maps[0].length; // 가로
            A = new int[ROW][];
            for (int i = 0; i < ROW; ++i) {
                A[i] = maps[i];
            }

            return BFS();
        }

        private int BFS() {
            boolean[][] visited = new boolean[ROW][COL];
            Queue<int[]> queue = new ArrayDeque<>();

            queue.add(new int[] {0, 0, 1}); // 출발 좌표임 row, col, distance

            while (!queue.isEmpty()) {
                int[] u = queue.remove();
                int r = u[0], c = u[1], distance = u[2]; // 현재 위치
                if (A[r][c] == 0) continue;
                if (visited[r][c]) continue;
                visited[r][c] = true;
                if (r == ROW - 1 && c == COL - 1) return distance;

                if (0 < r) queue.add(new int[] {r-1, c, distance+1}); // 윗 칸 등록
                if (0 < c) queue.add(new int[] {r, c-1, distance+1}); // 왼쪽 칸 등록
                if (r < ROW-1) queue.add(new int[] {r+1, c, distance+1}); // 아래 칸 등록
                if (c < COL-1) queue.add(new int[] {r, c+1, distance+1}); // 오른 칸 등록
            }

            return -1;
        }
    }
}
