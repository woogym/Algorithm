package Algorithm.Programers.level1;

import java.util.HashMap;
import java.util.Map;

// 가장 많이 받은 선물 - 2024 Kakao winter internship
public class P258712 {
    class Solution {
        public int solution(String[] friends, String[] gifts) {
            int n = friends.length;
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < friends.length; i++) {
                map.put(friends[i], i);
            }

            int[][] giveCount = new int[n][n];
            int[] giftIndex = new int[n];

            for (String gift : gifts) {
                String[] arr = gift.split(" ");
                int a = map.get(arr[0]);
                int b = map.get(arr[1]);

                giveCount[a][b]++;
                giftIndex[a] += 1;
                giftIndex[b] -= 1;
            }

            int[] nextMonthReceive = new int[n];

            for (int a = 0; a < n; a++) {
                for (int b = a + 1; b < n; b++) {
                    int ab = giveCount[a][b];
                    int ba = giveCount[b][a];

                    if (ab != ba) {
                        if (ab > ba) {
                            nextMonthReceive[a]++;
                        } else {
                            nextMonthReceive[b]++;
                        }
                    } else {
                        if (giftIndex[a] != giftIndex[b]) {
                            if (giftIndex[a] > giftIndex[b]) {
                                nextMonthReceive[a]++;
                            } else {
                                nextMonthReceive[b]++;
                            }
                        }
                    }
                }
            }

            int count = 0;
            for (int i : nextMonthReceive) {
                if (i > count) {
                    count = i;
                }
            }

            return count;
        }
    }
}
