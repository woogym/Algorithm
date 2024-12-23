package Algorithm.Programers.level1;

// 자연수 뒤집어 배열로 만들기
public class P12932 {
    class Solution {
        public int[] solution(long n) {
            int[] answer;

            StringBuilder number = new StringBuilder();
            number.append(n);
            number.reverse();
            String num = number.toString();

            answer = new int[num.length()];

            for (int i = 0; i < answer.length; i++) {
                String str = String.valueOf(num.charAt(i));
                answer[i] = Integer.parseInt(str);
            }

            return answer;
        }

        public int[] solution1(long n) {
            return new StringBuilder().append(n)
                    .reverse()
                    .chars()
                    .map(Character::getNumericValue)
                    .toArray();
        }
    }
}
