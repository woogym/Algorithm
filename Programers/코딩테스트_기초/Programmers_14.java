package Algorithm.Programers.코딩테스트_기초;

// 배열에서 대소문자 변경하기
public class Programmers_14 {
    class Solution {
        public String[] solution(String[] strArr) {
            String[] answer = new String[strArr.length];

            for (int i = 0; i < strArr.length; i++) {
                if (i % 2 == 0) {
                    answer[i] = strArr[i].toLowerCase();
                } else {
                    answer[i] = strArr[i].toUpperCase();
                }
            }

            return answer;
        }
    }
}
