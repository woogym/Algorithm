package Algorithm.Backjoon.ch02_조건문;
import java.util.*;
import java.io.*;

public class B2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int inputhour = Integer.parseInt(st.nextToken()); // 기본 입력 시간
        int inputmin = Integer.parseInt(st.nextToken()); // 기본 입력 분
        int inputaddmin = Integer.parseInt(br.readLine()); // 기본 입력 minute에 더할 minute

        int addhour = (inputmin + inputaddmin) / 60; // 더할 minute이 60이 넘을 경우 사용할 시간단위
        int addmin = (inputmin + inputaddmin) % 60; // 더할 minute에 60을 나누고 나머지 값 = 여분으로 남은 minute데이터

        int resulthour = 0;
        int resultmin = 0;

        if(inputaddmin >= 60){
            resulthour = inputhour + addhour;
            resultmin = addmin;
            if(resulthour >= 24){
                System.out.println((resulthour - 24) + " " + resultmin);
            } else{
                System.out.println(resulthour + " " + resultmin);
            }
        } else if(inputaddmin < 60){
            if((inputmin + inputaddmin) >= 60){
                if(inputhour == 23){
                    resultmin = addmin;
                    System.out.println(resulthour + " " + addmin);
                } else if(inputhour < 23){
                    resulthour = inputhour + 1;
                    resultmin = addmin;
                    System.out.println(resulthour + " " + resultmin);
                }
            }else if(inputmin + inputaddmin < 60){
                resulthour = inputhour;
                resultmin = inputmin + inputaddmin;
                System.out.println(resulthour + " " + resultmin);
            }
        }
    }
}
