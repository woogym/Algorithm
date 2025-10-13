package Algorithm.Programers.level2;

// 문자열 압축 - 2020 KAKAO BLIND RECRUITMENT
public class P60057 {
    class Solution {
        public int solution(String s) {
            int min = Integer.MAX_VALUE;

            for (int i = 1; i <= s.length() / 2; ++i) {
                int length = compress3(s, i);

                if (length < min) {
                    min = length;
                }
            }

            return min == Integer.MAX_VALUE ? s.length() : min;
        }

        private int compress3(String s, int n) {
            int result = 0;
            String prev = s.substring(0, n);
            int count = 1;

            for (int i = n; i <= s.length() - n; i += n) {
                if (s.substring(i, i + n).equals(prev)) {
                    ++count;
                } else {
                    if (count > 1) {
                        result += String.valueOf(count).length();
                    }

                    result += n; // 쪼갠 문자열 길이 더해주기
                    count = 1;
                    prev = s.substring(i, i + n);
                }
            }

            // 마지막은 수동으로 추가, 이유는 반복문 내부에서 처리하면 subString시에 조회하는 인덱스가 문자열 길이를 초과할 수 있음
            if (count > 1) {
                result += String.valueOf(count).length();
            }
            result += n;
            result += s.length() % n;

            return result;
        }

        private String compress2(String s, int n) {
            StringBuilder result = new StringBuilder();
            String prev = s.substring(0, n);
            int count = 1;

            for (int i = n; i < s.length() - n; i+=n) {
                if (s.substring(i, i + n).equals(prev)) {
                    ++count;
                } else {
                    if (count > 1) {
                        result.append(count);
                    }

                    result.append(prev);
                    prev = s.substring(i, i + n);
                    count = 1;
                }
            }

            if (count > 1) {
                result.append(count);
            }
            result.append(prev);
            int tail = s.length() % n;
            if (tail > 0) {
                result.append(s.substring(s.length() - tail));
            }

            return result.toString();
        }

        private String compress1(String s) {
            StringBuilder result = new StringBuilder();
            char prev = s.charAt(0); // 첫 문자
            int count = 1; // prev와 일치하는 문자의 수

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == prev) {
                    ++count;
                } else {
                    if (count > 1) {
                        result.append(count);
                    }

                    // 이전꺼 갱신, 값 초기화
                    result.append(prev);
                    prev = s.charAt(i);
                    count = 1;
                }
            }

            if (count > 1) {
                result.append(count);
            }
            result.append(prev);
            return result.toString();
        }
    }
}
