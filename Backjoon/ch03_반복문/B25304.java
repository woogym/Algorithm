package Algorithm.Backjoon.ch03_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int allPrice = Integer.parseInt(br.readLine());
        int productCount = Integer.parseInt((br.readLine()));

        int [] price = new int [productCount];
        int [] count = new int [productCount];
        int sum = 0;

        for (int i=0; i < productCount; i++) {
            String [] inputs = br.readLine().split(" ");
            price[i] = Integer.parseInt(inputs[0]);
            count [i] = Integer.parseInt(inputs[1]);
            sum += price[i] * count[i];
        }

        if(sum == allPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
