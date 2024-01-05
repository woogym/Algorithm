package Algorithm.Backjoon.ch02_조건문;
import java.io.*;
public class B14681 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int num = 0;

        if(x > num && num < y){
            System.out.println("1");
        } else if (x > num && num > y) {
            System.out.println("4");
        } else if(x < num && num < y){
            System.out.println("2");
        } else if(x < num && num > y){
            System.out.println("3");
        }
    }
}
// x,y 좌표를 입력받고 좌표가 몇 사분면에 속하는지 출력하는 문제이다
// &&, || 와 같은 논리연산의 복습이다