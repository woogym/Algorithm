package Algorithm.Backjoon.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

// 토마토 - 골드5
public class B7576 {

    private static int COL;
    private static int ROW;
    private static int[][] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        COL = Integer.parseInt(st.nextToken());
        ROW = Integer.parseInt(st.nextToken());
        A = new int[ROW][COL];

        for (int i = 0; i < ROW; i++) {
            String[] parts = br.readLine().split(" ");
            for (int j = 0; j < COL; j++) {
                A[i][j] = Integer.parseInt(parts[j]);
            }
        }

        System.out.println(BFS());
    }

    private static int BFS() {
        Queue<int []> queue = new ArrayDeque<>();

        int goalCount = 0;
        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {
                if (A[r][c] == 1) {
                    queue.add(new int[] {r,c});
                }
            }
        }

        int maxDays = 0;
        while (!queue.isEmpty()) {
            int[] u = queue.remove();
            int r = u[0], c = u[1];

            if (r > 0 && A[r - 1][c] == 0) {
                A[r - 1][c] = A[r][c] + 1;
                queue.add(new int[]{r - 1, c});
            }
            if (r < ROW - 1 && A[r + 1][c] == 0) {
                A[r + 1][c] = A[r][c] + 1;
                queue.add(new int[]{r + 1, c});
            }
            if (c > 0 && A[r][c - 1] == 0) {
                A[r][c - 1] = A[r][c] + 1;
                queue.add(new int[]{r, c - 1});
            }
            if (c < COL - 1 && A[r][c + 1] == 0) {
                A[r][c + 1] = A[r][c] + 1;
                queue.add(new int[]{r, c + 1});
            }
        }

        int max = 0;
        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {
                if (A[r][c] == 0) return -1;
                max = Math.max(max, A[r][c]);
            }
        }

        return max - 1;
    }
}


/**
6 4
1 -1 0 0 0 0
0 -1 0 0 0 0
0 0 0 0 -1 0
0 0 0 0 -1 1
**/