package Algorithm.Programers.코딩테스트_입문.part_61to80;

// 7의 개수
public class Programmers_69 {
    class Solution {
        public int solution(int[] array) {
            int answer = 0;
            String str = "";

            for (int i = 0; i < array.length; i++) {
                str += String.valueOf(array[i]);
            }

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '7') {
                    answer++;
                }
            }

            return answer;
        }
    }
}
