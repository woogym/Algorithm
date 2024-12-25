package Algorithm.Programers.level0;

// 접두사인지 확인하기
public class P181906 {
    class Solution {
        public int solution(String my_string, String is_prefix) {
            int answer = 0;

            if (my_string.startsWith(is_prefix)) {
                answer = 1;
            }

            return answer;
        }
    }
}
