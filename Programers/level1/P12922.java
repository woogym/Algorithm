package Algorithm.Programers.level1;

// 수박수박수박수박수박수?
public class P12922 {
    class Solution {
        public String solution(int n) {
            String waterMelon = "수박";
            StringBuilder sb = new StringBuilder();

            if (n % 2 == 0) {
                for (int i = 0; i < n/2; i++) {
                    sb.append(waterMelon);
                }

                return sb.toString();
            }

            for (int i = 0; i < n/2; i++) {
                sb.append(waterMelon);
            }
            sb.append("수");

            return sb.toString();
        }

        public String refactoring(int n) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n/2 + 1; i++) {
                sb.append("수박");
            }

            return sb.substring(0, n); // n -> 인자값은 exclusive로서 n - 1까지 포함된다는 뜻이다, n은 포함되지 않는다.
        }
    }
}
