package Algorithm.Backjoon.ch00_난이도측정불가;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

// 작업 공정 - 실패 ㅠㅠ 다음에 다시 도전..
public class B2221 {
    static List<Integer>[] children;
    static int[] depth;
    static int maxDepth = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        children = new ArrayList[N + 1];
        depth = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            children[i] = new ArrayList<>();
        }

        int root = 0;
        for (int i = 1; i <= N; i++) {
            int parent = Integer.parseInt(br.readLine());
            if (parent == -1) {
                root = i;
            } else {
                children[parent].add(i);
            }
        }

        calculateDepth(root);

        System.out.println(maxDepth);

        // 모든 직원이 있을 때 필요한 최소 작업 완료 시간을 유지하면서 해고할 수 있는 직원의 최대 수를 계산
        // 여기서는 전체 직원 수에서 깊이별 최소 필요한 직원 수의 합을 빼는 방식으로 계산
        int minEmployeesNeeded = calculateMinimumEmployeesNeeded(root, 0, new HashMap<>());
        System.out.println(N - minEmployeesNeeded);
    }

    static void calculateDepth(int node) {
        if (children[node].isEmpty()) {
            depth[node] = 1;
            return;
        }
        for (int child : children[node]) {
            calculateDepth(child);
            depth[node] = Math.max(depth[node], depth[child] + 1);
        }
        maxDepth = Math.max(maxDepth, depth[node]);
    }

    static int calculateMinimumEmployeesNeeded(int node, int currentDepth, HashMap<Integer, Integer> depthCount) {
        int currentCount = depthCount.getOrDefault(currentDepth, 0) + 1;
        depthCount.put(currentDepth, currentCount);

        for (int child : children[node]) {
            calculateMinimumEmployeesNeeded(child, currentDepth + 1, depthCount);
        }

        if (node == 1) { // 사장(루트 노드)에 도달했을 때
            int sum = 0;
            for (int count : depthCount.values()) {
                sum += count;
            }
            return sum;
        }
        return 0;
    }
}
