package Algorithm.Backjoon.ch08_일반수학1;

import java.util.Scanner;

public class B11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int b = sc.nextInt();
        long result = 0;
        String rslt = "";
        char a[] = new char[36];

        for(int i=0;i<10;i++){
            a[i]=(char)(i+'0');
        }
        for(int i=10;i<36;i++){
            a[i]=(char)(i + 'A' - 10);
        }
        while(n>0){
            result = n%b;
            n=n/b;
            rslt = a[(int)result]+rslt;
        }
        System.out.print(rslt);
    }
}