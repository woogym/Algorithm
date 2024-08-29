package Algorithm.Programers.코딩테스트_입문.part_61to80;

import java.util.Stack;

// 컨트롤 제트
public class Programmers_70 {
    class Solution {
        public int solution(String s) {
            int answer = 0;
            String[] ary = s.split(" ");

            for (int i = 0; i < ary.length; i++) {
                if (!ary[i].equals("Z")) {
                    answer += Integer.parseInt(ary[i]);
                } else {
                    answer -= Integer.parseInt(ary[i - 1]);
                }
            }

            return answer;
        }

        // stack을 사용해서 풀이해보자
        public int solution1(String s) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();

            for (String str : s.split(" ")) {
                if (str.equals("Z")) {
                    stack.pop(); // 가장 마지막에 넣었던 숫자 제거 -> stack은 LIFO이기 때문에
                } else {
                    stack.push(Integer.parseInt(str));
                }
            }

            for (int i : stack) {
                answer += i;
            }

            return answer;
        }
    }
}
