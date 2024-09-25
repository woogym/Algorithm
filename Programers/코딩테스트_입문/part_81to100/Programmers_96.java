package Algorithm.Programers.코딩테스트_입문.part_81to100;

// 안전 지대
public class Programmers_96 {
    class Solution {
        public int solution(int[][] board) {
            int n = board.length;
            boolean[][] dangerZone = new boolean[n][n];

            int[] dx = {-1, 1, 0, 0, -1, 1, -1, 1};
            int[] dy = {0, 0, -1, 1, -1, -1, 1, 1};

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 1) {
                        dangerZone[i][j] = true;
                        for (int k = 0; k < 8; k++) {
                            int nx = i + dx[k];
                            int ny = j + dy[k];

                            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                                dangerZone[nx][ny] = true;
                            }
                        }
                    }
                }
            }

            //
            int safeZoneCount = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!dangerZone[i][j]) {
                        safeZoneCount++;
                    }
                }
            }

            return safeZoneCount;
        }
    }
}
