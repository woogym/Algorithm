package Algorithm.Programers.level1;

import java.util.Arrays;

// 제일 작은수 제거하기
public class P12935 {
    class Solution {
        public int[] solution(int[] arr) {
            if (arr.length == 1) {
                return new int[] {-1};
            }

            int min = Arrays.stream(arr)
                    .min()
                    .getAsInt();

            return Arrays.stream(arr)
                    .filter(num -> num != min)
                    .toArray();
        }

        public int[] solution1(int[] arr) {
            if (arr.length == 1) {
                return new int[]{-1};
            }

            int[] answer = new int[arr.length - 1];
            int minIndex = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[minIndex] > arr[i]) {
                    minIndex = i;
                }
            }

            for (int i = minIndex+1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }

            for (int i = 0; i < answer.length; i++) {
                answer[i] = arr[i];
            }

            return answer;
        }
    }
}
