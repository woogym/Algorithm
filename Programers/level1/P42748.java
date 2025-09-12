package Algorithm.Programers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// K번째 수
public class P42748 {
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            List<Integer> answer = new ArrayList<>();

            for (int[] command : commands) {
                int i = command[0] - 1;
                int j = command[1] - 1;
                int k = command[2];
                List<Integer> ary = new ArrayList<>();

                for (int l = i; l <= j; l++) {
                    ary.add(array[l]);
                }

                Collections.sort(ary);
                answer.add(ary.get(k - 1));
            }

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        // refactoring
        public int[] solution1(int[] array, int[][] commands) {
            int[] answer = new int [commands.length];

            for (int i = 0; i < commands.length; i++) {
                int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1] - 1);
                Arrays.sort(temp);
                answer[i] = temp[commands[i][2] - 1];
            }

            return answer;
        }
    }
}
