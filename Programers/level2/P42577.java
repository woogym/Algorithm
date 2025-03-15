package Algorithm.Programers.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 전화번호 목록
public class P42577 {
    class Solution {

        // 정답 풀이 - 실제로는 O(NM)에 근접, 최악의 상황 O(N * M^2)
        public boolean solution(String[] phone_book) {
            Map<String, Boolean> map = new HashMap<>();

            for (String phoneNumber : phone_book) {
                map.put(phoneNumber, false);
            }

            for (String phoneNumber : map.keySet()) {
                for (int i = 0; i < phoneNumber.length(); i++) {
                    String prefix = phoneNumber.substring(0, i);
                    if (map.containsKey(prefix)) {
                        return false;
                    }
                }
            }

            return true;
        }

        // 리팩토링 - 효율성 검사 실패
        public boolean refactoring(String[] phone_book) {
            Map<String, Boolean> map = new HashMap<>();

            for (String phoneNumber : phone_book) {
                map.put(phoneNumber, false);
            }

            for (String phoneNumber : phone_book) {
                for (String otherNumber : map.keySet()) {
                    if (!phoneNumber.equals(otherNumber) && otherNumber.startsWith(phoneNumber)) {
                        return false;
                    }
                }
            }

            return true;
        }

        // Trie 자료구조를 이용한 풀이 - O(NM), 다만 HashMap보다 메모리를 많이 사용하게 되는 단점이 있다
        class TrieNode {
            Map<Character, TrieNode> children = new HashMap<>();
            boolean isEnd;
        }

        class Trie {
            TrieNode root = new TrieNode();

            boolean insert(String word) {
                TrieNode node = root;
                for (char c : word.toCharArray()) {
                    if (node.children.containsKey(c)) {
                        if (node.children.get(c).isEnd) return false;
                    } else {
                        node.children.put(c, new TrieNode());
                    }
                    node = node.children.get(c);
                }
                node.isEnd = true;
                return node.children.isEmpty();
            }
        }

        public boolean refactorting2(String[] phone_book) {
            Arrays.sort(phone_book); // ✅ 정렬하면 접두어 비교 최적화 가능
            Trie trie = new Trie();

            for (String phone : phone_book) {
                if (!trie.insert(phone)) return false;
            }

            return true;
        }

    }
}
