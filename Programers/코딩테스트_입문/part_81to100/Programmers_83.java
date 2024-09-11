package Algorithm.Programers.코딩테스트_입문.part_81to100;

public class Programmers_83 {
    class Solution {
        public String solution(String[] id_pw, String[][] db) {

            for (int i = 0; i < db.length; i++) {
                if (id_pw[0].equals(db[i][0])) {
                    if (id_pw[1].equals(db[i][1])) {
                        return "login";
                    } else {
                        return "wrong pw";
                    }
                }
            }

            return "fail";
        }
    }
}
