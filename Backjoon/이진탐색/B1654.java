package Algorithm.Backjoon.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 랜선 자르기
public class B1654 {

    private static int K;
    private static long N;
    private static int[] lines;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        K = Integer.parseInt(st.nextToken()); // 영식이가 가지고 있는 랜선 갯수
        N = Long.parseLong(st.nextToken()); // 필요한 랜선 갯수
        lines = new int[K];
        Long right = Long.MIN_VALUE;

        for (int i = 0; i < K; i++) {
            lines[i] = Integer.parseInt(br.readLine());
            if (right < lines[i]) {
                right = (long) lines[i];
            }
        }

        right++;

        System.out.println(search(0, right) - 1);
    }

    // 0 401 -> 0 200 -> ... 199 200
    private static long search(long left, long right) {
        while (left < right) {
            long middle = (left + right) / 2;
            long count = compare(middle);

            if (count < N) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return left;
    }

    private static long compare(long middle) {
        long count = 0;

        for (int line : lines) {
            count += line / middle;
        }

        return count;
    }
}
