package Algorithm.Programers.level3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 매칭 점수 - 2019 KAKAO BLIND RECRUITMENT
public class P42893 {
    class Solution {
        public int solution(String word, String[] pages) {
            // 기본점수 => 해당 웹페이지에 텍스 등장 횟수(대소문자 무시)
            // 외부 링크 수 => 다른 페이지로 연결된 링크의 갯수
            // 링크 점수 => 해당 웹페이지로 링크가 걸린 다른 웹페이지의 기본점수 / 외부 링크 수 의 총합
            // 매칭 점수 => 기본 점수 + 링크 점수

            // {매칭 점수, 기본점수, 링크 점수 = 기본점수 / 외부 링크 갯수}
            Map<String, double[]> pointMap = new HashMap<>();
            Map<String, List<String>> foreignlinkMap = new HashMap<>();

            for (String page : pages) {
                String body = bodyParsing(page);
                String url = urlParsing(page);
                List<String> foreignLinks = foreignLinkParsing(body);
                int basicPoint = basicPointCaculater(word, body);
                int out = foreignLinks.size();

                foreignlinkMap.put(url, foreignLinks);
                pointMap.put(url, new double[]{basicPoint, basicPoint, (double) basicPoint / out});
            }

            for (String url : pointMap.keySet()) {
                for (Entry<String, List<String>> foreignLink : foreignlinkMap.entrySet()) {
                    if (foreignLink.getKey().equals(url)) continue;
                    if (foreignLink.getValue().contains(url)) {
                        String anotherUrl = foreignLink.getKey();
                        double[] anotherUrlPointArr = pointMap.get(anotherUrl);
                        double[] pointArr = pointMap.get(url);
                        pointArr[0] += anotherUrlPointArr[2];
                    }
                }
            }

//          Ps. hashMap은 순서가 비보장이다
            int count = 0;
            double[] result = new double[pages.length];
            for (int i = 0; i < result.length; i++) {
                String url = urlParsing(pages[i]);
                result[i] = pointMap.get(url)[0];
            }

            double best = Double.NEGATIVE_INFINITY;
            int idx = 0;
            for (int i = result.length - 1; i >= 0; i--) {
                if (best <= result[i]) {
                    best = result[i];
                    idx = i;
                }
            }

            return idx;
        }

        private String textParsing(String body) {
            return body.replaceAll("(?i)<a\\s+[^>]*>.*?</a>", "").trim();
        }

        private List<String> foreignLinkParsing(String body) {
            Pattern linkPattern = Pattern.compile(
                    "<a\\s+[^>]*href=[\"']([^\"']+)[\"'][^>]*>(.*?)</a>",
                    Pattern.CASE_INSENSITIVE | Pattern.DOTALL
            );

            Matcher matcher = linkPattern.matcher(body);
            List<String> links = new ArrayList<>();

            while (matcher.find()) {
                String foreignUrl = matcher.group(1).trim();
                links.add(foreignUrl);
            }

            return links;
        }

        private String urlParsing(String page) {
            Pattern pattern = Pattern.compile("<meta property=\"og:url\" content=\"(\\S*)\"");
            Matcher matcher = pattern.matcher(page);

            matcher.find();
            return matcher.group(1);
        }

        private String bodyParsing(String page) {
            int bodyStartIdx = page.indexOf("<body>");
            int bodyLastIdx = page.indexOf("</body>");

            return page.substring(bodyStartIdx + 6, bodyLastIdx);
        }

        private int basicPointCaculater(String word, String body) {
            String[] bodyUrl = body.split("[^a-zA-Z]+");
            String lowerWord = word.toLowerCase();
            int count = 0;

            for (String s : bodyUrl) {
                if (lowerWord.equals(s.toLowerCase())) {
                    count++;
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {
        P42893.Solution solution = new P42893().new Solution();

        int count = solution.basicPointCaculater("blind",
                "Blind Lorem Blind ipsum dolor Blind test sit amet, consectetur adipiscing elit. \n");
        String url = solution.urlParsing("<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "  <meta charset=\"utf-8\">\n"
                + "  <meta property=\"og:url\" content=\"https://b.com\"/>\n"
                + "</head>\n"
                + "<body>\n"
                + "Suspendisse potenti. Vivamus venenatis tellus non turpis bibendum, \n"
                + "<a href=\"https://a.com\"> Link to a </a>\n"
                + "blind sed congue urna varius. Suspendisse feugiat nisl ligula, quis malesuada felis hendrerit ut.\n"
                + "<a href=\"https://c.com\"> Link to c </a>\n"
                + "</body>\n"
                + "</html>");

        System.out.println("count = " + count);
        System.out.println("url = " + url);
    }
}
