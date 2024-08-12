package Algorithm.Programers.코딩테스트_입문.part_41to60;

// 숫자 찾기
public class Programmers_54 {
    class Solution {
        public int solution(int num, int k) {
            String numStr = String.valueOf(num);
            char c = Integer.toString(k).charAt(0);

            for (int i = 0; i < numStr.length(); i++) {
                if (numStr.charAt(i) == c) {
                    return i + 1;
                }
            }

            return -1;
        }
    }
}
