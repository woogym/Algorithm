package Algorithm.Backjoon.ch04_1차원배열;
import java.io.*;
import java.util.*;
// 정수를 입력받고 그 갯수만큼의 정수를 입력받고 그 중 가장 큰 수와 가장 작은 수를 출력하는 문제
public class B10818 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //max, min보다 작은수와 연산하기 위한 선언
        int max = -1000001; //int정수값 범위중 가장 작은수로 선언
        int min = 1000001; //int정수값 범위중 가장 큰수로 선언

        while(st.hasMoreTokens()) {
            int value = Integer.parseInt(st.nextToken());
            if (value > max) { //max값과 value의 비교연산후에 max값에 입력받은 value값 저장 그리고 다음 입력된 value값과 저장돤 value값과 비교 연산하는 방식
                max = value;
            }
            if (value < min) { //max와 동일한 원리
                min = value;
            }
        }
        System.out.println(min + " " + max);


//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//
//        int [] arr = new int[n];
//        int index = 0;
//        while(st.hasMoreTokens()){ //StringTokenizer에 다음 토큰이 있다면 반복문 실행
//            arr[index] = Integer.parseInt(st.nextToken());//배열에 Integer형으로 삽입
//            index++;
//        }
//        Arrays.sort(arr);// Arrays.sort를 통해서 오름차순 정렬
//        System.out.println(arr[0] + " " + arr[n-1]); //오름차순 정렬로 첫번째로 최소값과 마지막 값으로 최댓값을 구해서 출력
//


//        Scanner sc = new Scanner(System.in);
//
//        int max = -99999;
//        int min = 99999;
//        int num = sc.nextInt();
//        int arr [] = new int[num];
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int j=0; j<arr.length; j++){
//            if(arr[j] >= max){
//                max = arr[j];
//            }
//            if(arr[j] <= min){
//                min = arr[j];
//            }
//        }
//        System.out.println(min + " " + max);
    }
}
