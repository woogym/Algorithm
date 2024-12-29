package Algorithm.Programers.level0;

// 글자 이어 붙여 문자열 만들기
public class P181915 {
    class Solution {
        public String solution(String my_string, int[] index_list) {
            StringBuilder sb = new StringBuilder();

//            for (int i = 0; i < index_list.length; i++) {
//                sb.append(my_string.charAt(index_list[i]));
//            }

            for (int idx : index_list) {
                sb.append(my_string.charAt(idx));
            }

            return sb.toString();
        }
    }
}
