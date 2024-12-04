package Algorithm.Programers.코딩테스트_기초;

// 조건에 맞게 수열 변환하기 1
public class Programmers_18 {
    class Solution {
        public int[] solution(int[] arr) {
            int[] answer = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    answer[i] = arr[i] / 2;
                    continue;
                }

                if (arr[i] < 50 && arr[i] % 2 != 0) {
                    answer[i] = arr[i] * 2;
                    continue;
                }

                answer[i] = arr[i];
            }

            return answer;
        }
    }
}
