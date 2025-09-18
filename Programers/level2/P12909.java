package Algorithm.Programers.level2;

import java.util.ArrayDeque;

// 올바른 괄호
public class P12909 {
    class Solution {
        boolean solution(String s) {
            ArrayDeque<Character> deque = new ArrayDeque<>();
            int count = 0;

            if (s.charAt(0) == ')') {
                return false;
            }

            for (int i = 0; i < s.length(); i++) {
                char index = s.charAt(i);

                if (index == '(') {
                    deque.offerFirst(index);
                    count++;
                }

                if (index == ')' && count > 0) {
                    deque.pollFirst();
                    count--;
                }
            }

            return count == 0;
        }

        // 개선
        boolean refactoring(String s) {
            int balance = 0;

            // 홀수 일떄는 즉시 실패
            if (s.length() % 2 == 1) {
                return false;
            }

            // 불필요한 선행 검사 제거 -> if (s.charAt(0) == ')') return false;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    balance++;
                } else {
                    if (balance == 0) { // 닫을게 없을때 즉시 실패하여 조기 리턴
                        return false;
                    }
                    balance--;
                }
            }

            return balance == 0;
        }
    }
}
