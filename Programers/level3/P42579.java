package Algorithm.Programers.level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 베스트 앨범
public class P42579 {
    class Solution {
        public int[] solution(String[] genres, int[] plays) {
            Map<String, Integer> genrePlayCounts = new HashMap<>();

//            for (int i = 0; i < genres.length; i++) {
//                genrePlayCounts.put(genres[i], genrePlayCounts.getOrDefault(genres[i], 0) + plays[i]);
//            }

            // 누적 재생횟수 적재의 또 다른 방법 - merge
            for (int i = 0; i < genres.length; i++) {
                genrePlayCounts.merge(genres[i], plays[i], Integer::sum);
            }

            ArrayList<String> genre = new ArrayList<>();
            for (String key : genrePlayCounts.keySet()) {
                genre.add(key);
            }

            Collections.sort(genre, (o1, o2) -> genrePlayCounts.get(o2) - genrePlayCounts.get(o1));

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < genre.size(); i++) {
                String g = genre.get(i);

                int max = 0;
                int firstIdx = -1;
                for (int j = 0; j < genres.length; j++) {
                    if (g.equals(genres[j]) && max < plays[j]) {
                        max = plays[j];
                        firstIdx = j;
                    }
                }
                
                max = 0;
                int secondIdx = -1;
                for (int j = 0; j < genres.length; j++) {
                    if (g.equals(genres[j]) && max < plays[j] && j != firstIdx) {
                        max = plays[j];
                        secondIdx = j;
                    }
                }

                list.add(firstIdx);
                if (0 <= secondIdx) {
                    list.add(secondIdx);
                }
            }

            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }

            return result;
        }
    }

    public static void main(String[] args) {
        P42579 p42579 = new P42579();
        P42579.Solution solution = p42579.new Solution();

        String[] genre = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        int[] values = solution.solution(genre, plays);
        for (int value : values) {
            System.out.println(value);
        }
    }
}
