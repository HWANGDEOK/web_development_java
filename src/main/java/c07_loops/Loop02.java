package c07_loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        /*
            기본 예제
            n에 숫자를 입력 받아 몇 번 반복할 지 정하고, 1부터 n까지 더하는 반복문을 작성하시오.

            실행 예
            몇 번 반복할 지 입력하세요 : 100
            합은 5050입니다.
         */
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 초기화
        int a=0;
        System.out.print("몇 번 반복할 지 입력하세요 : ");
        int n = sc.nextInt();
        // 1번 풀이
        for(int i = 1; i<n+1; i++){
            a+=i;
        }
        // 2번 풀이
//        for(int i = 0; i<n; i++){
//            a+=i+1;
        System.out.println("합은 " + a + "입니다.");
    }
}
