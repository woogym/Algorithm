package Algorithm.Programers.코딩테스트_기초;

import java.util.Arrays;

// 배열 비교하기
public class Programmers_8 {
    class Solution {
        public int solution(int[] arr1, int[] arr2) {

            if (arr1.length > arr2.length) {
                return 1;
            } else if (arr1.length < arr2.length) {
                return -1;
            } else {
                int arr1Sum = Arrays.stream(arr1).sum();
                int arr2Sum = Arrays.stream(arr2).sum();
                if (arr1Sum > arr2Sum) {
                    return 1;
                } else if (arr1Sum < arr2Sum) {
                    return -1;
                } else {
                    return 0;
                }
            }

        }
    }
}
