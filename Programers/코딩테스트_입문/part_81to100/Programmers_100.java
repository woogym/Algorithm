package Algorithm.Programers.코딩테스트_입문.part_81to100;

// 옹알이(1)
public class Programmers_100 {
    class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            String[] strArr = {"aya", "ye", "woo", "ma"};

            for (int i = 0; i < babbling.length; i++) {
                for (int j = 0; j < strArr.length; j++) {
                    babbling[i] = babbling[i].replace(strArr[j], " ");
                }

                if (babbling[i].trim().isEmpty()) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
