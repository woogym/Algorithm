package Algorithm.Programers.코딩테스트_입문.part_81to100;

// 캐릭터의 좌표
public class Programmers_81 {
    class Solution {
        public int[] solution(String[] keyinput, int[] board) {
            int[] answer = {0, 0};

            int xLimit = board[0] / 2;
            int yLimit = board[1] / 2;

            for (String str : keyinput) {
                switch (str) {
                    case "left":
                        if (answer[0] > -xLimit) answer[0]--;
                        break;
                    case "right":
                        if (answer[0] < xLimit) answer[0]++;
                        break;
                    case "up":
                        if (answer[1] < yLimit) answer[1]++;
                        break;
                    case "down":
                        if (answer[1] > -yLimit) answer[1]--;
                        break;
                }
            }

            return answer;
        }
    }
}
