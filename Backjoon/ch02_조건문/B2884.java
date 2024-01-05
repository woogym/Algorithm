package Algorithm.Backjoon.ch02_조건문;
import java.io.*;
import java.util.*;
public class B2884 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int alarm = 45;

        if(hour == 0){
            if(minute < alarm) {
                System.out.println((hour + 23) + " " + (60 - (alarm - minute)));
            } else if(minute >= alarm) {
                System.out.println(hour + " " + (minute - alarm));
            }
        } else if(minute < alarm){
            System.out.println((hour - 1) + " " + (60 - (alarm - minute)));
        } else if(minute >= alarm){
            System.out.println(hour + " " + (minute - alarm));
        }
    }
}
//입력 시간을 24시간 기준으로 계산하여 현재 입력한 시간보다 45분 전의 시간을 출력하는 프로그램
// ex) 0 30 -> 23 45 이런식이다