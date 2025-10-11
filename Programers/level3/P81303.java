package Algorithm.Programers.level3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

// 표 편집 - 2021 카카오 채용연계형 인턴십
public class P81303 {
    class Solution {
        public String solution(int n, int k, String[] cmd) {
            StringBuilder answer = new StringBuilder();
            Stack<Node> deletedRows = new Stack<>();
            Node[] nodes = new Node[n];

            for (int i = 0; i < n; i++) {
                nodes[i] = new Node();

                if (i == 0) {
                    continue;
                }

                nodes[i - 1].next = nodes[i];
                nodes[i].prev = nodes[i - 1];
            }

            Node current = nodes[k];

            for (String command : cmd) {
                char operation = command.charAt(0);

                switch (operation) {
                    case 'U':
                        int movement = Integer.parseInt(command.split(" ")[1]);
                        current = current.movePrev(movement);
                        break;
                    case 'D':
                        movement = Integer.parseInt(command.split(" ")[1]);
                        current = current.moveNext(movement);
                        break;
                    case 'C':
                        deletedRows.add(current);
                        current = current.delete();
                        break;
                    case 'Z':
                        Node node = deletedRows.pop();
                        node.restore();
                        break;
                }
            }

            for (int i = 0; i < n; i++) {
                if (nodes[i].removed) {
                    answer.append("X");
                    continue;
                }

                answer.append("O");
            }

            return answer.toString();
        }

        class Node {
            Node prev = null;
            Node next = null;
            boolean removed;

            public Node movePrev(int movement) {
                Node node = this;
                for (int i = 0; i < movement; i++) {
                    node = node.prev;
                }

                return node;
            }

            public Node moveNext(int movement) {
                Node node = this;
                for (int i = 0; i < movement; i++) {
                    node = node.next;
                }

                return node;
            }

            public Node delete() {
                this.removed = true;
                Node prev = this.prev; // 현시점 바로 뒤
                Node next = this.next; // 현시점 바로 앞

                if (prev != null) {
                    prev.next = next; // 이전이랑 앞이랑 연결해줌
                }

                if (next != null) {
                    next.prev = prev; // 앞에꺼랑 이전꺼랑 연결해줌
                    return next;
                }

                return prev;
            }

            public void restore() {
                this.removed = false;
                Node prev = this.prev;
                Node next = this.next;

                if (prev != null) {
                    prev.next = this;
                }

                if (next != null) {
                    next.prev = this;
                }
            }
        }
    }
}
