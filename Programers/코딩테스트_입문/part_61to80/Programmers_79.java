package Algorithm.Programers.코딩테스트_입문.part_61to80;

// 외계어 사전
public class Programmers_79 {
    class Solution {
        public int solution(String[] spell, String[] dic) {
            int answer = 2;
            int index = 0;

            for (int i = 0; i < dic.length; i++) {
                index = 0;
                for (int j = 0; j < spell.length; j++) {
                    if (dic[i].contains(spell[j])) {
                        index++;
                    }

                    if (index == spell.length) {
                        answer = 1;
                    }
                }
            }

            return answer;
        }
    }
}
