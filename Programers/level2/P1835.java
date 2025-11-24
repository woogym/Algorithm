package Algorithm.Programers.level2;


// 단체 사직 찍기 - 2017 카카오코드 본선
public class P1835 {
    class Solution {

        private final Character[] friends = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
        private boolean[] visited = new boolean[friends.length];
        private char[] line = new char[friends.length];
        private String[] data;
        private int count = 0;

        public int solution(int n, String[] data) {
            this.data = data;
            
            dfs("",0);

            return count;
        }

        private void dfs(String line, int depth) {
            if (depth == 8) {
                if (isValid(line)) {
                    count++;
                    return;
                }
            }

            for (int i = 0; i < 8; ++i) {
                if (!visited[i]) {
                    visited[i] = true;
                    dfs(line + friends[i],depth + 1);
                    visited[i] = false;
                }
            }
        }

        private boolean isValid(String line) {
            for (String datum : data) {
                int first = line.indexOf(datum.charAt(0));
                int second = line.indexOf(datum.charAt(2));
                int orderDistance = datum.charAt(4) - '0';
                char judge = datum.charAt(3);
                int betweenDistance = Math.abs(first - second) - 1;

                if (judge == '=' && betweenDistance != orderDistance) {
                    return false;
                }
                if (judge == '<' && betweenDistance >= orderDistance) {
                    return false;
                }
                if (judge == '>' && betweenDistance <= orderDistance) {
                    return false;
                }
            }
                
            return true;
        }
    }
}
