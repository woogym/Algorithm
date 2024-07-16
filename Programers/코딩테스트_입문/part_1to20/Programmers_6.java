package Algorithm.Programers.코딩테스트_입문.part_1to20;

// 나머지 구하기
public class Programmers_6 {
    class Solution {
        public int solution(int num1, int num2) {
            int answer = 0;

            if (num1 <= 100 && num2 <= 100)
                answer = num1 % num2;

            return answer;
        }
    }

    // 이런식으로도 풀 수 있을거 같다
    class Solution2 {
        public int solution(int num1, int num2) {
            while (num1 >= num2) {
                num1 = num1 - num2;
            }
            int answer = num1;
            return answer;
        }
    }
}


