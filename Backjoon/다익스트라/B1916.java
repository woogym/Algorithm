package Algorithm.Backjoon.다익스트라;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

// 최소비용 구하기 - 골드5
public class B1916 {

    private static int CITY;
    private static int BUS;
    private static int GOAL;
    private static List<int[]>[] edges;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        CITY = Integer.parseInt(br.readLine());
        BUS = Integer.parseInt(br.readLine());
        edges = new ArrayList[CITY+1];
        for (int i = 0; i <= CITY; i++) {
            edges[i] = new ArrayList<int []>();
        }

        for (int i = 0; i < BUS ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken()); // start
            int end = Integer.parseInt(st.nextToken()); // end
            int cost = Integer.parseInt(st.nextToken()); // cost
            edges[start].add(new int[] {end, cost});
        }

        st = new StringTokenizer(br.readLine(), " ");
        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());

        System.out.println(dijkstra(from, to));
    }

    private static int dijkstra(int from, int to) {
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        boolean[] visited = new boolean[CITY + 1];
        queue.add(new int[] {from, 0});

        while (!queue.isEmpty()) {
            int[] u = queue.remove();
            int node = u[0], distance = u[1];
            if (visited[node]) continue;
            visited[node] = true;
            if (node == to) return distance;
            for (int[] edge : edges[node]) {
                int neighor = edge[0], cost = edge[1];
                queue.add(new int[] {neighor, distance + cost});
            }
        }

        return -1;
    }
}
