package Algorithm.Backjoon.우선순위큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

// 절대값 힙
public class B11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                } else {
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });

        while (count-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if(x!=0) {
                priorityQueue.add(x);
            }
            else { // x가 0이라면 배열에서 절댓값이 가장 작은 값을 출력
                if(priorityQueue.isEmpty()) {
                    bw.write(0+"\n");
                } else {
                    priorityQueue.comparator();
                    bw.write(priorityQueue.poll()+"\n");
                }
            }
        }

        bw.flush();
        bw.close();
        bw.close();
    }
}
