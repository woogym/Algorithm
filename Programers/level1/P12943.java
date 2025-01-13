package Algorithm.Programers.level1;

// 콜라츠 추측
public class P12943 {
    class Solution {
        public int solution(long num) {
            int count = 0;

            while (num != 1) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }
                count++;

                if (count >= 500) {
                    count = -1;
                    break;
                }
            }

            return count;
        }

        public int solution1(int num) {
            long number = num;
            for (int i = 0; i < 500; i++) {
                if (number == 1) return i;
                number = (number % 2 == 0) ? number / 2 : number * 3 + 1;
            }

            return -1;
        }
    }
}
