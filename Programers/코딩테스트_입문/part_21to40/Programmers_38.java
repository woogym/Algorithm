package Algorithm.Programers.코딩테스트_입문.part_21to40;

// 자릿수 더하기
public class Programmers_38 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            String numStr = String.valueOf(n);

            for (int i = 0; i < numStr.length(); i++) {
                answer += Character.getNumericValue(numStr.charAt(i));
            }

            return answer;
        }

        // 수학적으로 계산
        public int solution1(int n) {
            int answer = 0;

            // n이 0보다 클 때 순회
            while (n > 0) {
                // 1의 자리부터 answer에 더하며 저장
                answer += n%10;
                // n의 자리수 높이기 작업
                n /= 10;
            }

            return answer;
        }
    }
}
