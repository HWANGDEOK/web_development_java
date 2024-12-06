package c05_scanner;

import java.util.Scanner;

public class BandName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 변수 선언 -> 초기화하지 않음
//        String name;
//        String age;
//        String school;
//        String mbti;
//
//        System.out.print("이름이 무엇입니까? : ");
//        // 변수 초기화
//        name = sc.nextLine();
//        System.out.print("몇 살입니까? : ");
//        age = sc.nextLine();
//        System.out.print("학교가 어디입니까? : ");
//        school = sc.nextLine();
//        System.out.print("MBTI는 어떻게 됩니까? : ");
//        mbti = sc.nextLine();
//
//        System.out.println("제 이름은 "+name+"이고, 나이는 "+age+"살 입니다.\n"+school+"에 재학 중이며, MBTI는 "+mbti+"입니다.");


        // pantsColor, lastFood 변수를 선언 -> String

        // 입력 받기 위한 안내문을 작성하고, 변수에 데이터를 대입하세요.
        // 지금 입은 하의 색깔이 무엇인가요?
        // 마지막으로 먹은 음식이 무엇인가요?

        // pantsColor와 lastFood를 이용하요 밴드 네임을 출력하세요.
        // 당신의 밴드 이름은 그레이 시리얼 입니다.

//        System.out.print("바지 색깔을 입력하세요 : ");
//        String pantsColor = sc.nextLine();
//        System.out.print("마지막으로 먹은 음식을 입력하세요 : ");
//        String lastFood = sc.nextLine();
//        System.out.println("당신의 밴드 이름은 '" +pantsColor+" "+lastFood+ "' 입니다.");

        // 2. 변수 선언 따로 초기화 따로
        String pantsColor, lastFood;
        String logo = """
                
                o.oOOOo.                     o\s
                 o     o                    O \s
                 O     O                    o \s
                 oOooOO.                    o \s
                 o     `O .oOoO' 'OoOo. .oOoO \s
                 O      o O   o   o   O o   O \s
                 o     .O o   O   O   o O   o \s
                 `OooOO'  `OoO'o  o   O `OoO'o\s
                                              \s
                                              \s
                """;
        System.out.println(logo);
        System.out.print("지금 입은 하의 색깔이 무엇인가요? : ");
        pantsColor = sc.nextLine();
        System.out.print("마지막으로 먹은 음식이 무엇인가요? : ");
        lastFood = sc.nextLine();
        System.out.println("당신의 밴드 이름은 '" +pantsColor+" "+lastFood+ "' 입니다.");




    }
}
