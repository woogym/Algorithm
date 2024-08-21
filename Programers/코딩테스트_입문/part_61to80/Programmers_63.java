package Algorithm.Programers.코딩테스트_입문.part_61to80;

// 모스부호(1)
public class Programmers_63 {
    class Solution {
        public String solution(String letter) {
            String answer = "";
            String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            String[] word = letter.split(" ");

            for (int i = 0; i < word.length; i++) {
                for (int j = 0; j < morse.length; j++) {
                    if (word[i].equals(morse[j])) {
                        answer += (char) (j + 97);
                    }
                }
            }

            return answer;
        }


        public String solution1(String letter) {
            String answer = "";
            String[] arr = letter.split(" ");

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(".-")) answer += "a";
                if (arr[i].equals("-...")) answer += "b";
                if (arr[i].equals("-.-.")) answer += "c";
                if (arr[i].equals("-..")) answer += "d";
                if (arr[i].equals(".")) answer += "e";
                if (arr[i].equals("..-.")) answer += "f";
                if (arr[i].equals("--.")) answer += "g";
                if (arr[i].equals("....")) answer += "h";
                if (arr[i].equals("..")) answer += "i";
                if (arr[i].equals(".---")) answer += "j";
                if (arr[i].equals("-.-")) answer += "k";
                if (arr[i].equals(".-..")) answer += "l";
                if (arr[i].equals("--")) answer += "m";
                if (arr[i].equals("-.")) answer += "n";
                if (arr[i].equals("---")) answer += "o";
                if (arr[i].equals(".--.")) answer += "p";
                if (arr[i].equals("--.-")) answer += "q";
                if (arr[i].equals(".-.")) answer += "r";
                if (arr[i].equals("...")) answer += "s";
                if (arr[i].equals("-")) answer += "t";
                if (arr[i].equals("..-")) answer += "u";
                if (arr[i].equals("...-")) answer += "v";
                if (arr[i].equals(".--")) answer += "w";
                if (arr[i].equals("-..-")) answer += "x";
                if (arr[i].equals("-.--")) answer += "y";
                if (arr[i].equals("--..")) answer += "z";
            }

            return answer;
        }
    }
}
