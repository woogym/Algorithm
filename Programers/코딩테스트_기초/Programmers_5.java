package Algorithm.Programers.코딩테스트_기초;

public class Programmers_5 {
    class Solution {
        public int solution(String num_str) {
            String[] numAry = num_str.split("");
            int num = 0;

            for (int i = 0; i < numAry.length; i++) {
                num += Integer.parseInt(numAry[i]);
            }

            return num;
        }
    }
}
