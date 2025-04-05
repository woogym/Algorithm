package Algorithm.Programers.level2;

// 스킬트리
public class P49993 {
    class Solution {
        public int solution(String skill, String[] skill_trees) {
            int answer = 0;
            String pattern = "[^" + skill + "]";

            for (int i = 0; i < skill_trees.length; i++) {
                String skill_tree = skill_trees[i].replaceAll(pattern, "");
                if (skill.startsWith(skill_tree)) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
