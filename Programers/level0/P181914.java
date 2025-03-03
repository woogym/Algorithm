package Algorithm.Programers.level0;

// 9로 나눈 나머지
public class P181914 {
    class Solution {
        public int solution(String number) {
            int num = 0;
            String[] ary = number.split("");

            for (int i = 0; i < ary.length; i++) {
                num += Integer.parseInt(ary[i]);
            }

            return num % 9;
        }
    }
}
