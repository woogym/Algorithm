package Algorithm.Programers.level1;

// 신규 아이디 추천 - 2021 KAKAO BLIND RECRUITMENT
public class P72410 {
    class Solution {
        public String solution(String new_id) {
            String str = new_id.toLowerCase()
                    .replaceAll("[^a-z0-9._-]", "")
                    .replaceAll("[.]{2,}", ".")
                    .replaceAll("^[.]|[.]$", "");

            str = str.isEmpty() ? "a" : str;

            // 실제 글자 16자 = len -> 16 = index 0~15
            if (str.length() > 15) {
                str = str.substring(0, 15);
            }

            str = str.replaceAll("[.]$", "");

            StringBuilder sb = new StringBuilder();
            sb.append(str);

            if (sb.length() <= 2) {
                while (sb.length() < 3) {
                    sb.append(str.charAt(str.length() - 1));
                }
            }

            return sb.toString();
        }
    }
}
