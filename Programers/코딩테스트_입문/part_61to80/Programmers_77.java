package Algorithm.Programers.코딩테스트_입문.part_61to80;

// 구슬을 나누는 경우의 수
public class Programmers_77 {
    class Solution {
        public int solution(int balls, int share) {
            int[][] memozation = new int[balls + 1][share + 1];

            return combination(balls, share, memozation);
        }

        // 메모제이션을 통한 중복계산을 통한 재귀 호출수 줄이기
        private int combination(int balls, int share, int[][] memo) {
            // 기저 조건
            if (balls == share || share == 0) {
                return 1;
            }

            // 이미 계산된 값이 있다면 반환
            if (memo[balls][share] != 0) {
                return memo[balls][share];
            }


            memo[balls][share] = combination(balls - 1, share - 1, memo) + combination(balls - 1, share, memo);
            return memo[balls][share];
        }


        // 재귀적 해법에 또 다른 해석
        public long solution1(int balls, int share) {
            share = Math.min(balls - share, share);

            if (share == 0) {
                return 1;
            }

            long result = solution1(balls - 1, share - 1);
            result *= balls;
            result /= share;

            return result;
        }
    }
}
