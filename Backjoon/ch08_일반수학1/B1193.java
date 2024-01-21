package Algorithm.Backjoon.ch08_일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int count = 0; // 마지막 수열
        int i = 1; // 괄호의 최댓값
        int mo = 0; //분모
        int ja = 0; //분자
        /*(1/1) -> (1/2 - 2/1) -> (3/1 - 2/2 - 3/1)
         -> (1/4 - 2/3 - 3/2 - 4/1) -> (5/1 - 4/2 - 3/3 - 2/4 - 1/5) -> ...
         여기서 규칙성을 찾았는데
         각 괄호들의 최댓값은 분수의 갯수와 동일하다는 점
         ex) 3번쨰 괄호는 최댓값이 3이라는 점
         수열이 1 - 3 - 6 - 10 - 15
         이런식으로 늘어나는데 여기서 숫자들은 각 괄호들의 마지막 마지막 분수의 순번
         이 숫자들은 규칙을 가지고 있는데
         바로 앞의 수열의 마지막 수열의 번호에 이번 해당 괄호의 번호를 더해주면
         다음 괄호의 마지막 번호를 알아낼 수 있음
         */
        while(count < num){ // 입력받은 수열의 번째가 count값보다 작아질때 까지 반복
            count = count + i; //count 앞 수열 괄호의 마지막 수열번째 + 현재 괄호 번호를 해서 count가 다음 괄호의 마지막 수열 차례를 알 수 있도록 함
            i++; // 다음 괄호 계산을 위한 준비단계
        }
        if((i-1)%2 == 0){ // 홀수일때
            mo = 1 + (count - num);
            ja = (i-1) - (count - num);
        }
        else{ // 짝수일때
            mo = (i-1) - (count - num);
            ja = 1 + (count - num);
        }
        /*
        짝수 일 때 1에서부터 해달 괄호의 count값에서 수열의 첫 값만큼 분모에 넣어주고
        분자에는 최댓값에서 마지막 부분에 해당 수열의 차만큼 빼주면 됨
        해당 수열의 분모, 분자를 알아낼 수 있음
        홀수 일 떄는 분모와 분자만 변경해서 초기화 해주면 구할 수 있음
         */
        System.out.println(ja + "/" + mo);
    }
}
