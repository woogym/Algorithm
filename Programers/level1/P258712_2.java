package Algorithm.Programers.level1;

import java.util.HashMap;
import java.util.Map;

// 가장 많이 받은 선물
public class P258712_2 {
    class Solution {
        public int solution(String[] friends, String[] gifts) {
            Map<String, Integer> graph = new HashMap<>();

            for (int i = 0; i < friends.length; i++) {
                graph.put(friends[i], i);
            }

            int[][] getGraph = new int[friends.length][friends.length];
            int[] giftIndex = new int[friends.length];

            for (String gift : gifts) {
                String[] ary = gift.split(" ");
                int from = graph.get(ary[0]);
                int to = graph.get(ary[1]);

                getGraph[from][to]++;
                giftIndex[from] += 1;
                giftIndex[to] -= 1;
            }

            int[] count = new int[friends.length];
            for (int from = 0; from < friends.length; from++) {
                for (int to = from + 1; to < friends.length; to++) {
                    int fromTo = getGraph[from][to];
                    int toFrom = getGraph[to][from];

                    if (fromTo != toFrom) {
                        if (fromTo > toFrom) {
                            count[from]++;
                        } else {
                            count[to]++;
                        }
                    } else {
                        if (giftIndex[from] == giftIndex[to]) {
                            continue;
                        } else if (giftIndex[from] > giftIndex[to]) {
                            count[from]++;
                        } else {
                            count[to]++;
                        }
                    }
                }
            }

            int answer = 0;
            for (int i : count) {
                if (i > answer) {
                    answer = i;
                }
            }

            return answer;
        }
    }
}
