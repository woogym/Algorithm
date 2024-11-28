package Algorithm.Programers.코딩테스트_기초;

// 특정한 문자를 대문자로 바꾸기
public class Programmers_12 {
    class Solution {
        public String solution(String my_string, String alp) {

            return my_string.replaceAll(alp, alp.toUpperCase());
        }
    }
}
