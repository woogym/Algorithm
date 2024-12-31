package Algorithm.Programers.level0;

// 수 조작하기 1
public class P181926 {
    class Solution {
        public int solution(int n, String control) {

            return n + controlReslt(control);
        }

        private int controlReslt(String control) {
            int number = 0;

            for (int i = 0; i < control.length(); i++) {
                char idx = control.charAt(i);

                if (idx == 'w') {
                    number += 1;
                } else if (idx == 's') {
                    number -= 1;
                } else if (idx == 'd') {
                    number += 10;
                } else if (idx == 'a') {
                    number -= 10;
                }
            }

            return number;
        }

        public int refactoring(int n, String control) {
            int answer = n;

            for (char idx : control.toCharArray()) {
                switch (idx) {
                    case 'w' : answer += 1; break;
                    case 's' : answer -= 1; break;
                    case 'd' : answer += 10; break;
                    case 'a' : answer -= 10; break;
                    default:break;
                }
            }

            return answer;
        }
    }
}
