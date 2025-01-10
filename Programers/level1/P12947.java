package Algorithm.Programers.level1;

import java.awt.image.BandedSampleModel;

// 하샤드 수
public class P12947 {
    class Solution {
        public boolean solution(int x) {
            int number = 0;
            String[] ary = Integer.toString(x).split("");
            for (String s : ary) {
                number += Integer.parseInt(s);
            }

            return x % number == 0;
        }
    }
}
