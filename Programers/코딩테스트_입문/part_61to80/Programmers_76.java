package Algorithm.Programers.코딩테스트_입문.part_61to80;

// 영어가 싫어요
public class Programmers_76 {
    class Solution {
        public long solution(String numbers) {
            String[] distinction = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for (int i = 0; i < distinction.length; i++) {
                numbers = numbers.replaceAll(distinction[i], String.valueOf(i));
            }

            return Long.parseLong(numbers);
        }
    }
}
