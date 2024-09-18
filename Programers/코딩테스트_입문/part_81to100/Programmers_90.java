package Algorithm.Programers.코딩테스트_입문.part_81to100;

// 다항식 더하기
public class Programmers_90 {
    class Solution {
        public String solution(String polynomial) {
            int xNum = 0;
            int constant = 0;
            String[] polyAry = polynomial.split(" ");

            for (int i = 0; i < polyAry.length; i++) {

                if (polyAry[i].contains("x")) {
                    if (polyAry[i].equals("x")) {
                        xNum += 1;
                    } else {
                        xNum += Integer.parseInt(polyAry[i].replace("x", ""));
                    }
                } else if (!polyAry[i].contains("+")){
                    constant += Integer.parseInt(polyAry[i]);
                }
            }

            return getmathematicalExpression(xNum, constant);
        }

        private String getmathematicalExpression(int xNum, int constant) {
            if (xNum == 0 && constant != 0) {
                return String.valueOf(constant);
            } else if (xNum != 0 && constant == 0) {
                return xNum == 1 ? "x" : xNum + "x";
            } else if (xNum != 0 && constant != 0) {
                return (xNum == 1 ? "x" : xNum + "x") + " + " + constant;
            } else {
                return "";
            }
        }

        // 리팩토링
        public String solution1(String polynomial) {
            int xNum = 0;
            int constant = 0;
            String[] polyAry = polynomial.split(" ");

            for (String term : polyAry) {
                if (term.contains("x")) {
                    xNum += term.equals("x") ? 1 : Integer.parseInt(term.replace("x", ""));
                } else if (!term.equals("+")) {
                    constant += Integer.parseInt(term);
                }
            }

            return buildExpression(xNum, constant);
        }

        private String buildExpression(int xNum, int constant) {
            StringBuilder sb = new StringBuilder();

            // x 항 처리
            if (xNum > 0) {
                sb.append(xNum == 1 ? "x" : xNum + "x");
            }

            // 상수항 처리
            if (constant > 0) {
                if (xNum > 0) {
                    sb.append(" + ");
                }
                sb.append(constant);
            }

            return sb.toString();
        }
    }
}
