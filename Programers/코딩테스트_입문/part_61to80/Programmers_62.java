package Algorithm.Programers.코딩테스트_입문.part_61to80;

// 진료순서 정하기 (생각보다 매우 헷갈렸음 복습해야할듯?)
public class Programmers_62 {
    class Solution {
        public int[] solution(int[] emergency) {
            int[] result = new int[emergency.length];

            for (int i = 0; i < emergency.length; i++) {
                for (int j = 0; j < emergency.length; j++) {
                    if (emergency[i] < emergency[j]){
                        result[i]++;
                    }
                }

                result[i]++;
            }

            return result;
        }
    }
}
