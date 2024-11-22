package Algorithm.Programers.코딩테스트_기초;

// 공백으로 구분하기
public class Programmers_10 {
    class Solution {
        public String[] solution(String my_string) {
            return my_string.trim().split("\\s+"); // 하나 이상의 공백을 의미하는 정규식! / "[ ]+" 도 동일한 기능을 수행함
        }
    }
}
