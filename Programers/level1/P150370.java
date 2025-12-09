package Algorithm.Programers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 개인정보 수집 유효기간
public class P150370 {
    class Solution {
        public int[] solution(String today, String[] terms, String[] privacies) {
            List<Integer> answer = new ArrayList<>();
            Map<Character, Integer> term = new HashMap<>();
            final int todate = parsingDate(today);

            for (String s : terms) {
                String[] ary = s.split(" ");
                term.put(s.charAt(0), Integer.parseInt(ary[1]));
            }

            for (int i = 0; i < privacies.length; i++) {
                String privacy = privacies[i];
                char ch = privacy.charAt(privacy.length() - 1); // 약관 종류
                int date = parsingDate(privacy);
                int length = term.get(ch) * 28; // 약관 기간

                int judgeDate = date + length - 1;

                if (todate > judgeDate) {
                    answer.add(i + 1);
                }
            }

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        private int parsingDate(String date) {
            String[] arr = date.substring(0, 10).split("\\.");
            int year = Integer.parseInt(arr[0]);
            int month = Integer.parseInt(arr[1]);
            int day = Integer.parseInt(arr[2]);

            return (year * 12 * 28) + (month * 28) + day;
        }
    }
}
