package Algorithm.Programers.코딩테스트_입문.part_41to60;

// 배열 원소의 길이
public class Programmers_49 {
    class Solution {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];

            for (int i = 0; i < strlist.length; i++) {
                answer[i] = strlist[i].length();
            }
            return answer;
        }
    }
}
