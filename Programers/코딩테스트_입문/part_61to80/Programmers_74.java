package Algorithm.Programers.코딩테스트_입문.part_61to80;

// 공 던지기
/*
머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때,
k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.
*/
public class Programmers_74 {
    class Solution {
        public int solution(int[] numbers, int k) {
            int index = 0;

            for (int i = 1; i < k; i++) {
                index+=2;
                if (numbers.length <= index) {
                    index -= numbers.length;
                }
            }

            return numbers[index];
        }

        public int solution1(int[] numbers, int k) {
            return (k-1)*2 % numbers.length + 1;
        }
    }
}
