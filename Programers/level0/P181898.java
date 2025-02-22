package Algorithm.Programers.level0;

public class P181898 {
    class Solution {
        public int solution(int[] arr, int idx) {
            for (int i = idx; i < arr.length; i++) {
                if (arr[i] == 1) {
                    return i;
                }
            }

            return -1;
        }
    }
}
