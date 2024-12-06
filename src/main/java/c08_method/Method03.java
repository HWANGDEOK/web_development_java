package c08_method;

import java.util.Scanner;

/*
    Method02.java 파일을 확인하시면 별찍기 관련한 method 수업 내용이 있습니다.
    getStar() 메서드를 확인하시면 내부에 if - else if - else 형태의 구문으로
    매개변수를 1-4까지를 받아서 왼쪽으로 증가하는 별,
    오른쪽으로 증가하는 별 등을 만들게끔 되어있습니다.

    하지만 if 문을 이용한 방식이 가독성이 너무 떨어지기 때문에 이를 switch문으로 사용
 */
public class Method03 {
    public static String getStar(int menuSelect, int totalLine){
        String result = "";
        switch (menuSelect){
            case 1 :
                for(int i=0; i<totalLine; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 2 :
                for(int i=0; i<totalLine; i++){
                    for(int j=0; j<totalLine-i-1; j++){
                        result += " ";
                    }
                    for (int k=0; k<i+1; k++){
                        result+="*";
                    }
                    result+="\n";
                }
                break;
            case 3:
                for(int i=0; i<totalLine; i++){
                    for(int j=0; j<totalLine-i; j++){
                        result+="*";
                    }
                    result+="\n";
                }
                break;
            case 4:
                for(int i=0; i<totalLine; i++){
                    for(int j=0; j<i; j++){
                        result+=" ";
                    }
                    for (int k=totalLine; k>i; k--){
                        result+="*";
                    }
                    result+="\n";
                }
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사용할 변수 선언
        int rowOfStars;
        int choice = 0;

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("메뉴 선택 : ");
        choice = sc.nextInt();

        while(choice>4 || choice<1){
            System.out.print("다시 메뉴를 선택하세요 : ");
            choice = sc.nextInt();
        }
        System.out.print("별의 줄 수 입력 : ");
        rowOfStars = sc.nextInt();
        System.out.println(" [ 호출하신 결과입니다 ] ");
        String stars = getStar(choice, rowOfStars);
        System.out.println(stars);
    }
}
