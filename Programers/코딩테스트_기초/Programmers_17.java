package Algorithm.Programers.코딩테스트_기초;

public class Programmers_17 {
    class Solution {
        public int solution(int[] num_list) {

            if (lengthDeciderOverThen10(num_list)) {
                return add(num_list);
            }

            return multiply(num_list);
        }

        private int add(int[] num_list) {
            int num = 0;
            for (int i : num_list) {
                num += i;
            }

            return num;
        }

        private int multiply(int[] num_list) {
            int num = 1;
            for (int i : num_list) {
                num *= i;
            }

            return num;
        }

        private boolean lengthDeciderOverThen10(int[] num_list) {
            return num_list.length > 10;
        }
    }
}
