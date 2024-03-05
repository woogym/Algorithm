package Algorithm.Backjoon.ch04_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B10807 {
    public static void main(String[] args) throws IOException {

//       # 첫번째 풀이

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        int num = Integer.parseInt(br.readLine());
//        int[] ary = new int[num];
//
//        st = new StringTokenizer(br.readLine()," ");
//
//        for (int i = 0; i < ary.length; i++) {
//            ary[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int count = Integer.parseInt(br.readLine());
//        int sum = 0;
//
//        for (int i = 0; i < ary.length; i++) {
//            if (ary[i] == count) {
//                sum++;
//            }
//        }
//
//        System.out.println(sum);

//        # 두번째 풀이 HashMap을 이용한 풀이 (성능에는 속도 차이가 없었다)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int v = Integer.parseInt(br.readLine());
        System.out.println(map.getOrDefault(v, 0));
    }
}
