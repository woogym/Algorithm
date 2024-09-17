package Algorithm.Programers.코딩테스트_입문.part_81to100;

// 문자열 밀기
public class Programmers_89 {
    class Solution {
        public int solution(String A, String B) {
            int answer = 0;

            String str = A;
            for (int i = 0; i < A.length(); i++) {
                if (str.equals(B)) {
                    return answer;
                }

                String a = str.substring(str.length() - 1); // 마지막 문자열 적출
                str = a + str.substring(0, str.length() - 1); // 마지막 문자열을 첫번째 순서로 가져오기
                answer++;
            }

            return -1;
        }

        // 또다른 풀이
        public int solution1(String A, String B) {
            String tempB = B.repeat(3);
            return tempB.indexOf(A);
        }
    }
}
