package Algorithm.Programers.코딩테스트_입문.part_81to100;

// OX퀴즈
public class Programmers_92 {
    class Solution {
        public String[] solution(String[] quiz) {
            String[] answer = new String[quiz.length];

            for (int i = 0; i < quiz.length; i++) {
                answer[i] = formulaDistinction(quiz[i]);
            }

            return answer;
        }

        private String formulaDistinction(String str) {
            String[] ary = str.split(" ");
            if (ary[1].equals("+")) {
                return (Integer.parseInt(ary[0]) + Integer.parseInt(ary[2]) == Integer.parseInt(ary[4])) ? "O" : "X";
            } else {
                return (Integer.parseInt(ary[0]) - Integer.parseInt(ary[2]) == Integer.parseInt(ary[4])) ? "O" : "X";
            }
        }
    }
}
