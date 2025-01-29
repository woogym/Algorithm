package Algorithm.Programers.level0;

// 문자열 바꿔서 찾기
public class P181864 {
    class Solution {
        public int solution(String myString, String pat) {
            String replaceStr = myString.replaceAll("A", "X")
                    .replaceAll("B","A")
                    .replaceAll("X", "B");

            return replaceStr.contains(pat) ? 1 : 0;
        }
    }
}
