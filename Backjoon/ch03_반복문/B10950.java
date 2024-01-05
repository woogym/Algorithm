package Algorithm.Backjoon.ch03_반복문;
import java.util.*;
import java.io.*;

public class B10950 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
//num으로 입력받은 수 만큼 2가지의 수를 입력 받아서
// 두 가지 수를 더한 결과를 출력해야하는 문재다
// 한번 더 문제 혼자서 풀어보기