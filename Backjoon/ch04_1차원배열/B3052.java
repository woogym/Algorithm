package Algorithm.Backjoon.ch04_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hashSet = new HashSet<Integer>();

        // Hashset은 값이 중복일 경우 저장이 되지 않고 hashset에 해당하는 값이 없으면 저장되는 원리
        for (int i = 0; i < 10; i++) {
            hashSet.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(hashSet.size());
    }
}