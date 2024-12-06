package c06_condition;

import java.util.Scanner;

public class Condition03 {
    public static void main(String[] args) {
        /*
            삼항 연산자
            정의 : 조건식을 평가하여 true 혹은 false 여부에 따라서 두 가지 실행문 중
            하나를 선택적으로 실행하는 구문

            형식 :

            조건식 ? 실행문1 : 실행문2

            일반적인 조건문을 삼항연산자로 변셩시키기 위한 조건
            1. if - else 구문으로만 이루어질 것
                -> else if가 있는 구문은 삼항연산자 변형이 어려움
            2. return 값에 대한 설정이 요구됨.
         */
//        2) if - else 구조 예제
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        String exampleSenetence = "";
        if(num >= 0) {
            System.out.println("num은 양수이거나 0입니다.");
        }else{      // else는 if가 false일 때 실행되는 최종 조건문이므로 조건식이
                    // 포함되지 않음 -> num이 0미만인 경우 // num < 0
            System.out.println("num은 음수입니다.");
        }
        // 이상의 if - else 구문을 3항 연산자로 바꾸시오.
        exampleSenetence = num >= 0 ? "num은 양수이거나 0입니다." : "num은 음수입니다"; // 삼항연산자 조건식 시작
        System.out.println(exampleSenetence);
    }

}
