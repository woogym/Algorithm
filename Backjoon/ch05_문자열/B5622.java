package Algorithm.Backjoon.ch05_문자열;

import java.io.IOException;

public class B5622 {
    public static void main(String[] args) throws IOException {

        int count = 0;
        int value;

        while (true) {
            value = System.in.read();

            if (value == '\n'){
                break;
            }

            if(value < 68) count += 3;
            else if(value < 71) count += 4;
            else if(value < 74) count += 5;
            else if(value < 77) count += 6;
            else if(value < 80) count += 7;
            else if(value < 84) count += 8;
            else if(value < 87) count += 9;
            else count += 10;
        }

        System.out.print(count);


        // 백준에서 case문에 대한 다중 케이스를 지원하지 않는 java버전이기에 아스키코드로 계산하는 방법으로 풀었음

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String str = br.readLine();
//
//        int count = 0;
//        int strlength = str.length();
//
//        for (int i = 0; i < strlength; i++) {
//
//            switch (str.charAt(i)){
//                case 'A', 'B', 'C' :
//                    count += 3;
//                    break;
//
//                case 'D', 'E', 'F' :
//                    count += 4;
//                    break;
//
//                case 'G', 'H', 'I' :
//                    count += 5;
//                    break;
//
//                case 'J', 'K', 'L' :
//                    count += 6;
//                    break;
//
//                case 'M', 'N', 'O' :
//                    count += 7;
//                    break;
//
//                case 'P', 'Q', 'R', 'S' :
//                    count += 8;
//                    break;
//
//                case 'T', 'U', 'V' :
//                    count += 9;
//                    break;
//
//                case 'W', 'X', 'Y', 'Z' :
//                    count += 10;
//                    break;
//            }
//        }
//        System.out.print(count);
//        br.close();
    }
}