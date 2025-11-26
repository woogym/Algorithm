package Algorithm.Backjoon.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 나무 자르기
public class B2805 {

    private static int woodCount;
    private static int needed;
    private static int[] woods;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        woodCount = Integer.parseInt(st.nextToken());
        needed = Integer.parseInt(st.nextToken());
        woods = new int[woodCount];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < woods.length; i++) {
            woods[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(woods);
        int right = woods[woods.length - 1];

        System.out.println(search(0, right));
    }

    private static int search(int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;
            long length = compare(middle);

            if (length <= 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return right;
    }

    private static long compare(int middle) {
        long sum = 0;
        for (int tree : woods) {
            if (middle < tree) {
                sum += tree - middle;
            }
        }

        return needed - sum;
    }
}
