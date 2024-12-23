package Algorithm.Programers.level0;

// 첫 번째로 나오는 음수
public class Programmers_18 {
    class Solution {
        public int solution(int[] num_list) {
            for (int i = 0; i < num_list.length; i++) {

                if (num_list[i] < 0) {
                    return i;
                }
            }

            return -1;
        }
    }
}
