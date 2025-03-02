package Algorithm.Programers.level0;

public class P181865 {
    class Solution {
        public int solution(String binomial) {
            String[] ary = binomial.split(" ");

            int num1 = Integer.parseInt(ary[0]);
            int num2 = Integer.parseInt(ary[2]);
            String op = ary[1];

            if (op.equals("+")) {
                return num1 + num2;
            } else if (op.equals("-")) {
                return num1 - num2;
            } else {
                return num1 * num2;
            }
        }
    }
}
