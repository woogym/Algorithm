package Algorithm.Programers.level0;

// 문자열의 뒤의 n글자
public class P181910 {
    class Solution {
        public String solution(String my_string, int n) {

            return my_string.substring(my_string.length() - n);
        }
    }
}
