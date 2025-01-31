package Algorithm.Programers.level0;
import java.util.Scanner;

public class P181950 {
    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            int n = sc.nextInt();

            System.out.println(str.repeat(n));
        }
    }
}
